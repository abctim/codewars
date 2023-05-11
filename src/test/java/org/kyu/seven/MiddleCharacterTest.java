package org.kyu.seven;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MiddleCharacterTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void getMiddle(String expected, String word) {

        String result = MiddleCharacter.getMiddle(word);

        assertEquals(expected, result);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("A", "A"),
                Arguments.of("Aa", "Aa"),
                Arguments.of("e", "tea"),
                Arguments.of("ea", "teas")
        );
    }
}