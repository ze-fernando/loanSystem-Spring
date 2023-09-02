# Loan

## Requirements

[JDK 17](https://www.oracle.com/br/java/technologies/downloads/)
[Maven](https://maven.apache.org/download.cgi)

## Challenge

[Challenge](https://github.com/backend-br/desafios/blob/master/loans/PROBLEM.md)

## Run

```
git clone https://github.com/ze-fernando/loanSystem-Spring

cd loanSystem-Spring

mvn spring-boot:run
```

## API

**Method {c:green}[POST]{/c}**
**Endopoint {{host}}/costumer-loans/**

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
> [!IMPORTANT]
> All fields must be passed
