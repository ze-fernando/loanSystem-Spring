package com.loan_api.loanapi.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class Costumer {
    @NotNull
    Integer age;
    @NotBlank
    String cpf;
    @NotBlank
    String name;
    @NotNull
    Double income;
    @NotBlank
    String location;
}
