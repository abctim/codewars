package org.kyu.seven;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ASquareOfSquaresTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void isSquare(boolean expected, int n) {

        boolean result = ASquareOfSquares.isSquare(n);

        assertEquals(expected, result);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(true, 0),
                Arguments.of(true, 4),
                Arguments.of(true, 9),
                Arguments.of(false, 10),
                Arguments.of(false, -1)
        );
    }
}