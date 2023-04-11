package org.kyu.seven;

/*https://www.codewars.com/kata/5390bac347d09b7da40006f6/train/java*/

public class JadenCase {
    public String toJadenCase(String phrase) {
        StringBuilder jadenCasePhrase = new StringBuilder();

        if (phrase == null || phrase.isBlank()) {
            return null;
        } else {
            String[] phraseAsArray = phrase.split(" ");
            for (int i = 0; i < phraseAsArray.length; i++) {
                String s = phraseAsArray[i];
                String capitalizedWord = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
                jadenCasePhrase.append(capitalizedWord);
                if (i < phraseAsArray.length - 1) {
                    jadenCasePhrase.append(" ");
                }
            }
            return jadenCasePhrase.toString();
        }
    }
}

