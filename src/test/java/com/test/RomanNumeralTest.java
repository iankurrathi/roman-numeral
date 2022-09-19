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

    @Test
    void shouldReturnRomanNumeralOf3() {
        assertEquals("III", romanNumeral.convert(3));
    }

    @Test
    void shouldReturnRomanNumeralOf4() {
        assertEquals("IV", romanNumeral.convert(4));
    }

    @Test
    void shouldReturnRomanNumeralOf5() {
        assertEquals("V", romanNumeral.convert(5));
    }

    @Test
    void shouldReturnRomanNumeralOf6() {
        assertEquals("VI", romanNumeral.convert(6));
    }

    @Test
    void shouldReturnRomanNumeralOf7() {
        assertEquals("VII", romanNumeral.convert(7));
    }

    @Test
    void shouldReturnRomanNumeralOf8() {
        assertEquals("VIII", romanNumeral.convert(8));
    }

    @Test
    void shouldReturnRomanNumeralOf9() {
        assertEquals("IX", romanNumeral.convert(9));
    }

    @Test
    void shouldReturnRomanNumeralOf10() {
        assertEquals("X", romanNumeral.convert(10));
    }
}
