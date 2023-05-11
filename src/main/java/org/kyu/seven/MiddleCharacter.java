package org.kyu.seven;

public class MiddleCharacter {
    public static String getMiddle(String word) {
        int middleIndex = word.length() / 2;
        
        if (word.length() % 2 == 0) {
            return word.substring(middleIndex -1, middleIndex + 1);
        } else {
            return word.substring(middleIndex, middleIndex + 1);
        }
    }
}
