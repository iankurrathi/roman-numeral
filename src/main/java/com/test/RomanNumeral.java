package com.test;

import java.util.Map;

public class RomanNumeral {

    private static final Map<Integer, String> romanNumeralsMap = Map.of(
            1, "I",
            2, "II",
            3, "III",
            4, "IV",
            5, "V",
            6, "VI",
            7, "VII",
            8, "VIII",
            9, "IX",
            10, "X");

    public String convert(int number) {
        return romanNumeralsMap.get(number);
    }

}
