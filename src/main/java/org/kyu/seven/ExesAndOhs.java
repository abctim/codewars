package org.kyu.seven;

public class ExesAndOhs {
    public static boolean getXO(String str) {
        str = str.toLowerCase();
        return str.replace("o","").length() == str.replace("x","").length();
    }
}