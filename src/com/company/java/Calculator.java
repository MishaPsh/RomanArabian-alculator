package com.company.java;

import java.util.InputMismatchException;

public class Calculator {

    int calculate(int variable1, int variable2, char operation) {
        int result = 0;
        switch (operation) {
            case '+':
                result = variable1 + variable2;
                break;
            case '-':
                result = variable1 - variable2;
                break;
            case '*':
                result = variable1 * variable2;
                break;
            case '/':
                try {
                    result = variable1 / variable2;
                    break;
                } catch (ArithmeticException e) {
                    System.out.println("Exception : " + e);
                    System.out.println("You can't divide by zero.");
                    break;
                }
            default:
                result = -1;
                break;
        }
        return result;
    }

}
