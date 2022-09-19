package com.test;

import java.util.Map;

public class RomanNumeral {

    private static final Map<Integer, String> romanNumeralsMap = Map.of(
            1, "I",
            2, "II",
            3, "III");

    public String convert(int number) {
        return romanNumeralsMap.get(number);
    }

}
