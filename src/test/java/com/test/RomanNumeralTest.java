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
                Arguments.of(11, "XI"),
                Arguments.of(12, "XII"),
                Arguments.of(13, "XIII"),
                Arguments.of(14, "XIV"),
                Arguments.of(15, "XV"),
                Arguments.of(16, "XVI"),
                Arguments.of(17, "XVII"),
                Arguments.of(18, "XVIII"),
                Arguments.of(19, "XIX"),
                Arguments.of(20, "XX"),
                Arguments.of(21, "XXI"),
                Arguments.of(22, "XXII"),
                Arguments.of(23, "XXIII"),
                Arguments.of(24, "XXIV"),
                Arguments.of(25, "XXV"),
                Arguments.of(26, "XXVI"),
                Arguments.of(27, "XXVII"),
                Arguments.of(28, "XXVIII"),
                Arguments.of(29, "XXIX"),
                Arguments.of(30, "XXX")

                );
    }
}
