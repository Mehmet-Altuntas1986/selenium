package com.cybertek.tests;

import com.github.javafaker.CreditCardType;

public class Faker {
    public static void main(String[] args) {
        System.out.println("Hello World");   //sout  then enter ---> short cut

        com.github.javafaker.Faker faker =new com.github.javafaker.Faker();   //bu method dummy, fake data olusturmakta kullaniliyor

        System.out.println(faker.name().fullName());
        System.out.println(faker.harryPotter().character());
        System.out.println(faker.finance().creditCard(CreditCardType.FORBRUGSFORENINGEN));



    }
}

//POM.XML YI AC VE  LINE 19 A BAK, DEPENDY EKLEDIK O SITEYE DIDEREK BIR CODE ALDIK VE YAPISTIRDIK

