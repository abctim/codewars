package org.kyu.seven;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ExesAndOhsTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void getXO(boolean expected, String str) {

        boolean result = ExesAndOhs.getXO(str);

        assertEquals(expected, result);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(true, "xo"),
                Arguments.of(true, "xxoo"),
                Arguments.of(false, "xx"),
                Arguments.of(true, "abc"),
                Arguments.of(true, "abcxo")
        );
    }
}