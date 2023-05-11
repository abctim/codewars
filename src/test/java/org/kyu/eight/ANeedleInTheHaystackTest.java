package org.kyu.eight;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ANeedleInTheHaystackTest {
    @ParameterizedTest
    @MethodSource("testCases")
    public void testFindNeedle(String expected, Object[] haystack) {
        assertEquals(expected, ANeedleInTheHaystack.findNeedle(haystack));
    }

    static Collection<Arguments> testCases() {
        return Arrays.asList(
                Arguments.of("found the needle at position 0", new Object[] {"needle"}),
                Arguments.of("found the needle at position 1", new Object[] {"x", "needle"}),
                Arguments.of("found the needle at position 0", new Object[] {"needle", "x"})
        );
    }
}
