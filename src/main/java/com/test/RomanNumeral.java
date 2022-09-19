package com.test;

public class RomanNumeral {

    public String convert(int number) {
        StringBuilder romanNumeral = new StringBuilder();
        number = remainder(number, romanNumeral, 10, "X");
        number = remainder(number, romanNumeral, 9, "IX");
        number = remainder(number, romanNumeral, 5, "V");
        number = remainder(number, romanNumeral, 4, "IV");
        number = remainder(number, romanNumeral, 3, "III");
        number = remainder(number, romanNumeral, 2, "II");
        remainder(number, romanNumeral, 1, "I");

        return romanNumeral.toString();
    }

    private int remainder(int number, StringBuilder romanNumeral, int divisor, String romanSymbol) {
        while (number >= divisor) {
            number = number - divisor;
            romanNumeral.append(romanSymbol);
        }
        return number;
    }

}
