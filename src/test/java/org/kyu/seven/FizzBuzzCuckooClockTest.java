package org.kyu.seven;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzCuckooClockTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void fizzBuzzCuckooClock(String expected, String time) {

        String result = FizzBuzzCuckooClock.fizzBuzzCuckooClock(time);

        assertEquals(expected, result);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("tick", "13:34"),
                Arguments.of("Cuckoo Cuckoo", "14:00"),
                Arguments.of("Cuckoo Cuckoo Cuckoo", "15:00"),
                Arguments.of("Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo", "00:00"),
                Arguments.of("Fizz Buzz", "11:15"),
                Arguments.of("Fizz", "03:03"),
                Arguments.of("Buzz", "08:55")
        );
    }
}