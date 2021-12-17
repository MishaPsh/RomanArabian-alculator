package com.company.java;

import java.util.Scanner;

public class ScannerData {
     private  Scanner scanner = new Scanner(System.in);
     private String userInputScanner = scanner.nextLine();
     private char operation;

    public char getOperation() {
        return operation;
    }

    char[] takeArrayCharFromScanner() {
        char[] arrayCharUserInput = new char[10];
        for (int i = 0; i < userInputScanner.length(); i++) {
            arrayCharUserInput[i] = userInputScanner.charAt(i);
            if (arrayCharUserInput[i] == '+') {
                operation = '+';
            }
            if (arrayCharUserInput[i] == '-') {
                operation = '-';
            }
            if (arrayCharUserInput[i] == '*') {
                operation = '*';
            }
            if (arrayCharUserInput[i] == '/') {
                operation = '/';
            }
        }
        return arrayCharUserInput;
    }
}

