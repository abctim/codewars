package org.kyu.six;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MultiplesOf3or5Test {

    @ParameterizedTest
    @MethodSource("testCases")
    void solution(int expected, int number) {
        MultiplesOf3or5 multiplesOf3or5 = new MultiplesOf3or5();

        int result = multiplesOf3or5.solution(number);

        assertEquals(expected, result);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(0, -1),
                Arguments.of(0, 1),
                Arguments.of(0, 3),
                Arguments.of(3, 4),
                Arguments.of(8, 6),
                Arguments.of(23, 10)
        );
    }
}