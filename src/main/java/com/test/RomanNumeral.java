package com.test;

import java.util.Map;

public class RomanNumeral {

    private static final Map<Integer, String> romanNumeralsMap = Map.of(
            1, "I",
            2, "II",
            3, "III",
            4, "IV");

    public String convert(int number) {
        StringBuilder romanNumeral = new StringBuilder();
        while (number >= 10) {
            number = number % 10;
            romanNumeral.append("X");
        }
        while (number >= 9) {
            number = number % 9;
            romanNumeral.append("IX");
        }
        while (number >= 5) {
            number = number % 5;
            romanNumeral.append("V");
        }
        if (number > 0) {
            romanNumeral.append(romanNumeralsMap.get(number));
        }

        return romanNumeral.toString();
    }

}
