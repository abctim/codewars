package org.kyu.eight;

import java.util.Arrays;

public class ANeedleInTheHaystack   {
    public static String findNeedle(Object[] haystack) {
        int indexOfNeedle = Arrays.asList(haystack).indexOf("needle");
        return "found the needle at position " + indexOfNeedle;
    }
}
