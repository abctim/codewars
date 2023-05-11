package org.kyu.seven;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BetweenExtremesTest {
    @ParameterizedTest
    @MethodSource("testCases")
    public void testBetweenExtremes(int expected, int[] numbers) {
        assertEquals(expected, BetweenExtremes.betweenExtremes(numbers));
    }

    static Collection<Arguments> testCases() {
        return Arrays.asList(
                Arguments.of(0, new int[] {0, 0}),
                Arguments.of(1, new int[] {0, 1}),
                Arguments.of(2, new int[] {1, 2, 3}),
                Arguments.of(4, new int[] {-1, 2, 3}),
                Arguments.of(2, new int[] {-1, -2, -3}),
                Arguments.of(2, new int[] {0, -1, -2})
        );
    }
}

