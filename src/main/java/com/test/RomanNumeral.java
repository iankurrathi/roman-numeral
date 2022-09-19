package com.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumeral {

    private static final Map<Integer, String> romanSymbols = new LinkedHashMap<>();

    static {
        romanSymbols.put(400, "CD");
        romanSymbols.put(100, "C");
        romanSymbols.put(90, "XC");
        romanSymbols.put(50, "L");
        romanSymbols.put(40, "XL");
        romanSymbols.put(10, "X");
        romanSymbols.put(9, "IX");
        romanSymbols.put(5, "V");
        romanSymbols.put(4, "IV");
        romanSymbols.put(3, "III");
        romanSymbols.put(2, "II");
        romanSymbols.put(1, "I");
    }

    public String convert(int number) {
        StringBuilder romanNumeral = new StringBuilder();
        for (Map.Entry<Integer, String> entry : romanSymbols.entrySet()) {
            number = remainder(number, romanNumeral, entry.getKey(), entry.getValue());
        }
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
