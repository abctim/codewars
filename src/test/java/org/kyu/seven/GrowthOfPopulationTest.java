package org.kyu.seven;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class GrowthOfPopulationTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void nbYear(int expected, int p0, double percent, int aug, int p) {

        int result = GrowthOfPopulation.nbYear(p0, percent, aug, p);

        assertEquals(expected, result);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(15, 1500, 5, 100, 5000),
                Arguments.of(10, 1500000, 2.5, 10000, 2000000),
                Arguments.of(94, 1500000, 0.25, 1000, 2000000)
        );
    }
}