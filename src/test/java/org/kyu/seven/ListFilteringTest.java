package org.kyu.seven;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ListFilteringTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void filterList(List<Object> expected, List<Object> list) {

        List<Object> result = ListFiltering.filterList(list);

        assertEquals(expected, result);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(List.of(1), Arrays.asList(1, "test")),
                Arguments.of(List.of(1, 2), Arrays.asList(1, "test", 2)),
                Arguments.of(List.of(1, 2, 3), Arrays.asList("test", 1, 2, 3))
        );
    }
}