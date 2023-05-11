package org.kyu.seven;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class HighestAndLowestTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void testHighAndLow(String expected, String numbers) {

        String result = HighestAndLowest.highAndLow(numbers);

        assertEquals(expected, result);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("0 0", "0 0 0 0"),
                Arguments.of("1 0", "1 0 0 0"),
                Arguments.of("1 -1", "1 -1 0 0"),
                Arguments.of("1 1", "1"),
                Arguments.of("5 1", "1 2 3 4 5")
        );
    }
}