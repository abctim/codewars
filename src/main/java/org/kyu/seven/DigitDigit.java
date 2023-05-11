package org.kyu.seven;

public class DigitDigit {
    public int squareDigits(int n) {
        StringBuilder squaredNumber = new StringBuilder();
        String nString = Integer.toString(n);

        for (int i = 0; i < nString.length(); i++) {
            int digit = Character.getNumericValue(nString.charAt(i));
            squaredNumber.append(digit * digit);
        }
        return Integer.parseInt(squaredNumber.toString());
    }
}
