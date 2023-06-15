package org.kyu.seven;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MaskifyTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void maskify(String expected, String str) {

        String result = Maskify.maskify(str);

        assertEquals(expected, result);
    }

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("1234", "1234"),
                Arguments.of("#1234", "11234"),
                Arguments.of("##1234", "111234")
        );
    }
}