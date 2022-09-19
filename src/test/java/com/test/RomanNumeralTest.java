package com.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralTest {

    private RomanNumeral romanNumeral;

    @BeforeEach
    void setUp() {
        romanNumeral = new RomanNumeral();
    }

    @Test
    void shouldReturnRomanNumeralOf1() {
        assertEquals("I", romanNumeral.convert(1));
    }

    @Test
    void shouldReturnRomanNumeralOf2() {
        assertEquals("II", romanNumeral.convert(2));
    }
}
