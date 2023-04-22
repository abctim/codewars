package org.kyu.seven;

/*https://www.codewars.com/kata/5642bf07a586135a6f000004/train/java*/

import java.util.stream.IntStream;

public class GreenGlassDoor {
    public boolean stepThroughWith(String s) {
        return IntStream.range(1, s.length()).anyMatch(i -> s.charAt(i) == s.charAt(i -1));
    }
}
