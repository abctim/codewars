package org.kyu.seven;

import java.util.Arrays;
import java.util.Comparator;

public class HighestAndLowest {
    public static String highAndLow(String numbers) {
        String[] numbersStringArray = numbers.split(" ");
        Arrays.sort(numbersStringArray, Comparator.comparingInt(Integer::parseInt));

        return numbersStringArray[numbersStringArray.length -1] + " " + numbersStringArray[0];
    }
}
