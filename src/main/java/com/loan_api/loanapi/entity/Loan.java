package com.loan_api.loanapi.entity;

import lombok.Value;

@Value
public class Loan {
    private Type type;
    private Integer interest_rate;
}
