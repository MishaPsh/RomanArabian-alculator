package com.company.java;

public class Value {
    private ScannerData pars = new ScannerData();
    private RomanNumerals romanNumerals = new RomanNumerals();
    private Calculator calculator = new Calculator();

    {
        pars.takeArrayCharFromScanner();
    }

    private char operation = pars.getOperation();
    private String StringUserInput = String.valueOf(pars.takeArrayCharFromScanner());
    private String[] stringArray = StringUserInput.split("[+-/*]");
    private String value_1_FromStringArray = stringArray[0];
    private String valueTemp = stringArray[1];
    private String value_2_FromStringArray = valueTemp.trim();


    void sss() {
        System.out.println("Input:");
        int variable1 = romanNumerals.convertRomanToArabian(value_1_FromStringArray);
        int variable2 = romanNumerals.convertRomanToArabian(value_2_FromStringArray);
        int result = 0;


        if (variable1 < 0 && variable2 < 0) {
            result = result;
        } else {
            if ((variable1 > 0 && variable1 < 11) && (variable2 > 0 && variable2 < 11)) {
                result = calculator.calculate(variable1, variable2, operation);
                String resultRoman = romanNumerals.convertArabianToRoman(result);
                System.out.println(romanNumerals.convertArabianToRoman(variable1) + " " + operation + " " +
                        romanNumerals.convertArabianToRoman(variable2));
                System.out.println("Output:");
                System.out.println(resultRoman);
            } else {
                System.out.println("Римские цифры не находятся в допустимом диапазоне");
            }
        }

        try {
            variable1 = Integer.parseInt(value_1_FromStringArray);
            variable2 = Integer.parseInt(value_2_FromStringArray);
            result = calculator.calculate(variable1, variable2, operation);
            if ((variable1 > 0 && variable1 < 11) && (variable2 > 0 && variable2 < 11)) {
                System.out.println(variable1 + " " + operation + " " + variable2);
                System.out.println("Output:");
                System.out.println(result);
            } else {
                System.out.println("Арабские цифры не находятся в допустимом диапазоне");
            }
        } catch (NumberFormatException e) {

        }
    }
}


