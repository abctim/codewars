package org.kyu.five;

public class PigLatin {
    public static String pigIt(String str) {
        String[] strings = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String string : strings) {
            String modifiedString = string.substring(1) +
                    string.charAt(0) +
                    "ay ";
            result.append(modifiedString);
        }
        return result.toString().trim();
    }
}
