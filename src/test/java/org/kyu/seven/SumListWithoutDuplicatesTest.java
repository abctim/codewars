package org.kyu.seven;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumListWithoutDuplicatesTest {

    @ParameterizedTest
    @MethodSource("testCases")
    public void testSumNoDuplicates(int expected, int[] arr) {
        assertEquals(expected, SumListWithoutDuplicates.sumNoDuplicates(arr));
    }

    static Collection<Arguments> testCases() {
        return Arrays.asList(
            Arguments.of(0, new int[] {1, 1, 2, 2}),
            Arguments.of(3, new int[] {1, 2, 3, 3}),
            Arguments.of(1, new int[] {1, 2, 2, 3, 3})
        );
    }
}
