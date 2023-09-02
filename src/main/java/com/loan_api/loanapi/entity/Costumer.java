package com.loan_api.loanapi.entity;

import lombok.Value;

@Value
public class Costumer {
    Integer age;
    String cpf;
    String name;
    Double income;
    String location;
}
