package org.kyu.seven;

public class FizzBuzzCuckooClock {
    public static String fizzBuzzCuckooClock(String time) {
        int hours = Integer.parseInt(time.substring(0,2));
        int minutes = Integer.parseInt(time.substring(3, 5));

        if (hours == 0 && minutes == 0) {
            return generateCuckoos(12);
        } else if (minutes == 0) {
            return generateCuckoos(hours);
        } else if (minutes == 30) {
            return "Cuckoo";
        } else if (minutes % 3 == 0 && minutes % 5 == 0) {
            return "Fizz Buzz";
        } else if (minutes % 3 == 0) {
            return "Fizz";
        } else if (minutes % 5 == 0) {
            return "Buzz";
        } else {
            return "tick";
        }
    }

    private static String generateCuckoos(int hours) {
        StringBuilder cuckoos = new StringBuilder();
        if (hours > 12) {
            hours = hours - 12;
        }
        for (int i = 0; i < hours; i++) {
            cuckoos.append("Cuckoo ");
        }
        return cuckoos.toString().trim();
    }
}
