package com.loan_api.loanapi.entity;

import java.util.List;

import lombok.Value;

@Value
public class Response {
    private String customerName;
    private List<Loan> loans;
}
