package org.kyu.seven;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ComplementaryDNATest {

    @ParameterizedTest
    @MethodSource("testCases")
    void makeComplement(String expected, String dna) {

        String result = ComplementaryDNA.makeComplement(dna);

        assertEquals(expected, result);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("AACC", "TTGG"),
                Arguments.of("TTGG", "AACC"),
                Arguments.of("ATCG", "TAGC")
        );
    }
}