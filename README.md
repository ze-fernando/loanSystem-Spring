# Loan

## {c:orange}Requirements{c/}
[JDK 17](https://www.oracle.com/br/java/technologies/downloads/)
[Maven](https://maven.apache.org/download.cgi)

## {c:orange}Challeng{c/}
[Challenge](https://github.com/backend-br/desafios/blob/master/loans/PROBLEM.md)

## {c:orange}Run{c/}
ˋˋˋ
git clone https://github.com/ze-fernando/loanSystem-Spring

cd loanSystem-Spring

mvn spring-boot:run
ˋˋˋ

## {c:orange}API{c/}
**Method {c:green}[POST]{/c}**
**Endopoint {{host}}/costumer-loans/**

## {c:orange}Tutorial{c/}
**Send your request for endpoint with**
Ex:
ˋˋˋ
{
  "age": 20,
  "cpf": "123.654.789-00",
  "name": "Maria Du",
  "income": 7000.00,
  "location": "SP"
}
ˋˋˋ
!All fields must be passed
