package org.kyu.six;

import java.util.Objects;

public class StringToCamelCase {
    static String toCamelCase(String s){
        String[] words = s.split("[-_]");
        StringBuilder stringBuilder = new StringBuilder();

        for (String word : words) {
            if (Objects.equals(word, words[0])){
                stringBuilder.append(word);
            } else {
                stringBuilder.append(word.substring(0,1).toUpperCase()
                        + word.substring(1).toLowerCase());
            }
        }
        return stringBuilder.toString();
    }
}
