package org.kyu.seven;

public class Maskify {
    public static String maskify(String str) {
        StringBuilder maskifiedString = new StringBuilder();
        int lastFourDigits = 4;

        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - lastFourDigits){
                maskifiedString.append("#");
            } else {
                maskifiedString.append(str.charAt(i));
            }
        }
        return maskifiedString.toString();
    }
}
