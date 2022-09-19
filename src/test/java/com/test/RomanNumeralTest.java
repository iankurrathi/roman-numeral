package com.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralTest {

    private RomanNumeral romanNumeral;

    @BeforeEach
    void setUp() {
        romanNumeral = new RomanNumeral();
    }

    @ParameterizedTest
    @MethodSource("providesNumberAndExpectedRomanSymbol")
    void shouldConvertNumber(int number, String expectedRomanSymbol) {
        assertEquals(expectedRomanSymbol, romanNumeral.convert(number));
    }

    private static Stream<Arguments> providesNumberAndExpectedRomanSymbol() {
        return Stream.of(
                Arguments.of(1, "I"),
                Arguments.of(2, "II"),
                Arguments.of(3, "III"),
                Arguments.of(4, "IV"),
                Arguments.of(5, "V"),
                Arguments.of(6, "VI"),
                Arguments.of(7, "VII"),
                Arguments.of(8, "VIII"),
                Arguments.of(9, "IX"),
                Arguments.of(10, "X"),
                Arguments.of(11, "XI")
                );
    }
}
