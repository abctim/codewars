package org.kyu.seven;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DigitDigitTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void testSquareDigits(int expected, int n) {

        DigitDigit digitDigit = new DigitDigit();

        int result = digitDigit.squareDigits(n);

        assertEquals(expected, result);
    }

    static Stream<Arguments> testCases() {
      return Stream.of(
              Arguments.of(0, 0),
              Arguments.of(1, 1),
              Arguments.of(44, 22),
              Arguments.of(493625, 765)
      );
    }
}