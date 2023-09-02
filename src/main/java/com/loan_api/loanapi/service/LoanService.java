package com.loan_api.loanapi.service;

import java.util.List;

import com.loan_api.loanapi.entity.Loan;
import com.loan_api.loanapi.entity.Type;

public class LoanService {
    
    public static void personalLoan(List<Loan> l){
        Loan loan = new Loan(Type.PERSONAL, 4);
        l.add(loan); 
    }

    public static void guaranteedLoan(List<Loan> l){
        Loan loan = new Loan(Type.GUARANTEED, 3);
        l.add(loan); 
    }

    public static void consignmentLoan(List<Loan> l){       
        Loan loan = new Loan(Type.CONSIGNNENT, 2);
        l.add(loan); 
    }
}
