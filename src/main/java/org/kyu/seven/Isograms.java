package org.kyu.seven;

public class Isograms {
    public static boolean  isIsogram(String str) {
        String lowerCaseStr = str.toLowerCase();
        for (int i = 0; i < lowerCaseStr.length() -1; i++) {
            if (lowerCaseStr.charAt(i) == lowerCaseStr.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}