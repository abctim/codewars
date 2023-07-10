package org.kyu.seven;

public class GrowthOfPopulation {
    public static int nbYear(int p0, double percent, int aug, int p) {
        int currentPopulation = p0;
        int years = 0;

        while (currentPopulation < p) {
            currentPopulation += currentPopulation * (percent / 100) + aug;
            years ++;
        }
        return years;
    }
}
