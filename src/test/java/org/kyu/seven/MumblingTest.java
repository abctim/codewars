package org.kyu.seven;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MumblingTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void accum(String expected, String s) {

        String result = Mumbling.accum(s);

        assertEquals(expected, result);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("A-Bb-Ccc", "abc"),
                Arguments.of("A-Bb-Ccc-Dddd", "abcd"),
                Arguments.of("A-Bb-Ccc-Dddd", "AbCd")
        );
    }
}