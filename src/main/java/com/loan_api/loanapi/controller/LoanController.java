package com.loan_api.loanapi.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.loan_api.loanapi.entity.Costumer;
import com.loan_api.loanapi.entity.Loan;
import com.loan_api.loanapi.entity.Response;
import com.loan_api.loanapi.service.LoanService;

import jakarta.validation.Valid;


@RestController
@Controller
public class LoanController {
 

    @PostMapping("/customer-loans")
    public Response customer(@RequestBody @Valid Costumer c){

        boolean valid = c.getLocation().toUpperCase().equals("SP") &&
            c.getAge() < 30 &&
            c.getIncome() <= 5000;

        List<Loan> list = new ArrayList<>();

        if (c.getIncome() <= 3000) LoanService.personalLoan(list);

        if (valid) LoanService.personalLoan(list);

        if (c.getIncome() >= 5000) LoanService.consignmentLoan(list);

        if (c.getIncome() <= 3000) LoanService.guaranteedLoan(list); 

        if (valid) LoanService.guaranteedLoan(list); 

        
        Response response = new Response(c.getName(), list);
        

        return response;
    }

}
