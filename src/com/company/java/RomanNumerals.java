package com.company.java;

import java.util.InputMismatchException;
import java.util.Scanner;

class RomanNumerals {

    String convertArabianToRoman(int numArabian) {
        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI",
                "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII",
                "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII",
                "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI",
                "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI",
                "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII",
                "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII",
                "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI",
                "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX",
                "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        String s = roman[numArabian];
        return s;
    }


    int convertRomanToArabian(String roman) {

        try {
            if (roman.equals("I")) {
                return 1;
            }
            if (roman.equals("II")) {
                return 2;
            }
            if (roman.equals("III")) {
                return 3;
            }
            if (roman.equals("IV")) {
                return 4;
            }
            if (roman.equals("V")) {
                return 5;
            }
            if (roman.equals("VI")) {
                return 6;
            }
            if (roman.equals("VII")) {
                return 7;
            }
            if (roman.equals("VIII")) {
                return 8;
            }
            if (roman.equals("IX")) {
                return 9;
            }
            if (roman.equals("X")) {
                return 10;
            }
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не подходящий символ");
        }
        return -1;
    }
}
