package org.kyu.eight;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class KeepUpTheHoopTest {

    @ParameterizedTest
    @MethodSource("testCases")
    public void hoopCountTest(String expected, int n) {
        assertEquals(expected, KeepUpTheHoop.hoopCount(n));
    }

    static Collection<Arguments> testCases() {
        return Arrays.asList(
            Arguments.of("Great, now move on to tricks", 10),
            Arguments.of("Great, now move on to tricks", 11),
            Arguments.of("Keep at it until you get it", 1),
            Arguments.of("Keep at it until you get it", -1)
        );
    }
}
