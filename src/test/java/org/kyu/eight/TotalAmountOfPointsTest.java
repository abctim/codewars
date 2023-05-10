package org.kyu.eight;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class TotalAmountOfPointsTest {

    @ParameterizedTest
    @MethodSource("testCases")
    public void pointsTest(int expected, String[] games) {
        assertEquals(expected, TotalAmountOfPoints.points(games));
    }

    static Collection<Arguments> testCases() {
        return Arrays.asList(
                Arguments.of(10,new String[] {"0:0","0:0","0:0","0:0","0:0","0:0","0:0","0:0","0:0","0:0"}),
                Arguments.of(12,new String[] {"1:0","0:0","0:0","0:0","0:0","0:0","0:0","0:0","0:0","0:0"}),
                Arguments.of(9,new String[] {"0:1","0:0","0:0","0:0","0:0","0:0","0:0","0:0","0:0","0:0"}),
                Arguments.of(11,new String[] {"0:1","1:0","0:0","0:0","0:0","0:0","0:0","0:0","0:0","0:0"})
        );
    }
}