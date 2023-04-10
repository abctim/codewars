package org.kyu.seven;

import java.util.Arrays;
import java.util.NoSuchElementException;

/*https://www.codewars.com/kata/56d19b2ac05aed1a20000430*/

public class BetweenExtremes {
    public static int betweenExtremes(int[] numbers) throws NoSuchElementException
    {
        int max = Arrays.stream(numbers).max().orElseThrow(NoSuchElementException::new);
        int min = Arrays.stream(numbers).min().orElseThrow(NoSuchElementException::new);
        return max - min;
    }
}
