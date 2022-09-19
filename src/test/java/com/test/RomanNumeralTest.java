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
    void shouldConvertNumber1() {
        assertEquals("I", romanNumeral.convert(1));
    }

    @Test
    void shouldConvertNumber2() {
        assertEquals("II", romanNumeral.convert(2));
    }

    @Test
    void shouldConvertNumber3() {
        assertEquals("III", romanNumeral.convert(3));
    }

    @Test
    void shouldConvertNumber4() {
        assertEquals("IV", romanNumeral.convert(4));
    }

    @Test
    void shouldConvertNumber5() {
        assertEquals("V", romanNumeral.convert(5));
    }

    @Test
    void shouldConvertNumber6() {
        assertEquals("VI", romanNumeral.convert(6));
    }

    @Test
    void shouldConvertNumber7() {
        assertEquals("VII", romanNumeral.convert(7));
    }

    @Test
    void shouldConvertNumber8() {
        assertEquals("VIII", romanNumeral.convert(8));
    }

    @Test
    void shouldConvertNumber9() {
        assertEquals("IX", romanNumeral.convert(9));
    }

    @Test
    void shouldConvertNumber10() {
        assertEquals("X", romanNumeral.convert(10));
    }

    @Test
    void shouldConvertNumber11() {
        assertEquals("XI", romanNumeral.convert(11));
    }
}
