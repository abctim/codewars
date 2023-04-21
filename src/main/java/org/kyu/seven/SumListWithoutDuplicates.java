package org.kyu.seven;

/*https://www.codewars.com/kata/5993fb6c4f5d9f770c0000f2/train/java*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SumListWithoutDuplicates {
    public static int sumNoDuplicates(int[] arr){
        Set<Integer> noDuplicateSet = new HashSet<>();
        ArrayList<Integer> noDuplicateArrayList = new ArrayList<>();
        int noDuplicateSum = 0;

        for (int i : arr) {
            if (noDuplicateSet.add(i)) {
                noDuplicateArrayList.add(i);
            } else {
                noDuplicateArrayList.remove((Integer) i);
            }
        }

        for (Integer integer : noDuplicateArrayList) {
            noDuplicateSum += integer;
        }
        return noDuplicateSum;
    }
}
