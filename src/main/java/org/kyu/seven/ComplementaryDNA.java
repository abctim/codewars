package org.kyu.seven;

public class ComplementaryDNA {
    public static String makeComplement(String dna) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < dna.length(); i++) {
            char currentChar = dna.charAt(i);
            complementString(result, currentChar);
        }
        return result.toString();
    }

    private static void complementString(StringBuilder result, char currentChar) {
        switch (currentChar) {
            case 'A':
                result.append("T");
                break;
            case 'T':
                result.append("A");
                break;
            case 'C':
                result.append("G");
                break;
            case 'G':
                result.append("C");
                break;
        }
    }
}
