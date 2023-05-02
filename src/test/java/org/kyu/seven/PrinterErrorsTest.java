package org.kyu.seven;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

public class PrinterErrorsTest {
    @ParameterizedTest
    @MethodSource("testCases")
    public void testPrinterErrors(String expected, String s) {
        assertEquals(expected, PrinterErrors.printerError(s));
    }

    static Collection<Arguments> testCases() {
        return Arrays.asList(
            Arguments.of("0/3", "abc"),
            Arguments.of("1/4", "abcz"),
            Arguments.of("1/4", "zabc"),
            Arguments.of("2/5", "azbzc")
        );

    }
}