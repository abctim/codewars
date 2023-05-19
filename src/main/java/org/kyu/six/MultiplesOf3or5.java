package org.kyu.six;

public class MultiplesOf3or5 {
    public int solution(int number) {
        int result = 0;

        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
        }
        return result;
    }
}
