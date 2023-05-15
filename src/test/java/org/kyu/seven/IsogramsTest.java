package org.kyu.seven;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class IsogramsTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void isIsogram(boolean expected, String str) {

        boolean result = Isograms.isIsogram(str);

        assertEquals(expected, result);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(false, "moose"),
                Arguments.of(false, "MoOsE"),
                Arguments.of(false, "mooose"),
                Arguments.of(false, "moosegoose"),
                Arguments.of(true, "test"),
                Arguments.of(true, "tEsT")
        );
    }
}