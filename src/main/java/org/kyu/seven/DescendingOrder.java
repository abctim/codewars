package org.kyu.seven;

import java.util.Arrays;
import java.util.Comparator;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        String[] numStringArray = String.valueOf(num).split("");
        Arrays.sort(numStringArray, Comparator.reverseOrder());

        return Integer.parseInt(String.join("", numStringArray));
    }
}
