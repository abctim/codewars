package org.kyu.five;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PigLatinTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void pigIt(String expected, String str) {

        String result = PigLatin.pigIt(str);

        assertEquals(expected, result);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("igPay atinlay siay oolcay", "Pig latin is cool"),
                Arguments.of("hisTay siay ymay tringsay", "This is my string")
        );
    }
}