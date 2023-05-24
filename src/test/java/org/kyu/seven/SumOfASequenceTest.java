package org.kyu.seven;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SumOfASequenceTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void sequenceSum(int expected, int start, int end, int step) {

        int result = SumOfASequence.sequenceSum(start, end, step);

        assertEquals(expected, result);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(0, 100, 1, 3),
                Arguments.of(2, 2, 2, 2),
                Arguments.of(12, 2, 6, 2),
                Arguments.of(15, 1, 5, 1),
                Arguments.of(5, 1, 5, 3)
        );
    }
}