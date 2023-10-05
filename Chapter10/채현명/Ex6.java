package Chapter10.채현명;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex6 {

    public static int count(String s, char c) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        return countConsecutive(s, c, 0, 0, 0);
    }

    private static int countConsecutive(String s, char c, int index, int currentCount, int maxCount) {
        if (index == s.length()) {
            return maxCount;
        }

        if (s.charAt(index) == c) {
            currentCount++;
            if (currentCount > maxCount) {
                maxCount = currentCount;
            }
        } else {
            currentCount = 0;
        }

        return countConsecutive(s, c, index + 1, currentCount, maxCount);
    }

    public static void main(String[] args) {
        int result = count("null", 'n');
        System.out.println(result);
    }
}
