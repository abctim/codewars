package org.kyu.seven;

public class Mumbling {
    public static String accum(String s) {
        StringBuilder result = new StringBuilder();
        int count = 0;

        for (char c : s.toCharArray()) {
            StringBuilder currentString = new StringBuilder();
            for (int i = 0; i <= count; i++) {
                if (i == 0) {
                    currentString.append(Character.toUpperCase(c));
                } else {
                    currentString.append(Character.toLowerCase(c));
                }
            }
            count++;

            if (s.length() != count) {
                currentString.append("-");
            }

            result.append(currentString);
        }
        return result.toString();
    }
}

