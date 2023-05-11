package org.kyu.seven;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DescendingOrderTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void sortDesc(int expected, int num) {

        int result = DescendingOrder.sortDesc(num);

        assertEquals(expected, result);
    }
    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(321, 123),
                Arguments.of(321, 132),
                Arguments.of(3321, 1332),
                Arguments.of(0, 0)
        );
    }
}