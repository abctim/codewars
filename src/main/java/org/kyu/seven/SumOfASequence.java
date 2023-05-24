package org.kyu.seven;

public class SumOfASequence {
    public static int sequenceSum(int start, int end, int step) {
        int result = 0;
        if (start > end){
            return 0;
        } else {
            for (int i = start; i <= end; i += step) {
                result += i;
            }
        }
        return result;
    }
}
