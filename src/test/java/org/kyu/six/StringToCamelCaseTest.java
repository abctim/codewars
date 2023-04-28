package org.kyu.six;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringToCamelCaseTest {

    @ParameterizedTest
    @CsvSource({
            "testNumberOne, test-number-one",
            "testNumberTwo, test_number_two",
            "TestNumberThree, Test-number_three",
    })
    void toCamelCase(String expected, String s) {
        String result = StringToCamelCase.toCamelCase(s);

        assertEquals(expected, result);
    }
}