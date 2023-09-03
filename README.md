# Loan's

## Requirements

[JDK 17](https://www.oracle.com/br/java/technologies/downloads/)

[Maven](https://maven.apache.org/download.cgi)

## Challenge by back-end Brasil

[Challenge's here](https://github.com/backend-br/desafios/blob/master/loans/PROBLEM.md)

## Run

```
git clone https://github.com/ze-fernando/loanSystem-Spring

cd loanSystem-Spring

mvn spring-boot:run
```

## API

**Method [POST]** 

**Endpoint**

`{{host}}/costumer-loans/`

## Tutorial

**Send your request for endpoint with**

Ex:

```
{
  "age": 20,
  "cpf": "123.654.789-00",
  "name": "Maria Du",
  "income": 7000.00,
  "location": "SP"
}
```

## Rules
**Loan**
* for salaries between 3,000 and 5,000, age under 30 and location in SP, secured and personal loan
* for salaries equal to or greater than 5 thousand, consigned loan
* for wages below 3,000, secured and personal loan

**Rnterest rate**
* for Peronal, 4%
* for Secured, 3%
* for Consigned, 2%


> [!IMPORTANT]
> All fields must be passed
