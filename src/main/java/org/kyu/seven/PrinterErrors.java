package org.kyu.seven;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrinterErrors {
    public static String printerError(String s) {
        Pattern pattern = Pattern.compile("[n-z]");
        Matcher matcher = pattern.matcher(s);
        int errorCount = 0;

        while (matcher.find()) {
            errorCount++;
        }
        return errorCount + "/" + s.length();
    }
}
