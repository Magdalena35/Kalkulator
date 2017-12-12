package com.kodilla.testing.calculator;

public class Calculator {

    int add(int a, int b){
        return (a+b);
    }
    int subtract(int a, int b){
        return (a-b);

    }

    public static void main (String [] args){
        Calculator calculator = new Calculator();
        calculator.add(4,2);
        calculator.subtract(4,2);

    }

}
