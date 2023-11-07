package Step2.Chapter4.minseok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Exercise {

    public static void printCapitalized(String str) {
        String[] str1 = str.split(" ");

        StringBuilder sb = new StringBuilder();
        for (String word : str1) {
            sb.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1))
                    .append(" ");
        }
        System.out.println(sb);
    }

    public static int hexValue(char ch) {
        switch (Character.toUpperCase(ch)) {
            case '0':
                return 0;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            case 'A':
                return 10;
            case 'B':
                return 11;
            case 'C':
                return 12;
            case 'D':
                return 13;
            case 'E':
                return 14;
            case 'F':
                return 15;
            default:
                return -1;
        }
    }

    public static int diceCount(int number) {
        int count = 0;
        int sum = 0;
        if (number > 13 || number < 1) {
            throw new IllegalArgumentException("2와 12 사이의 숫자를 입력하셔야 합니다.");
        }
        while (sum != number) {
            int a = (int) ((Math.random() * 6) + 1);
            int b = (int) ((Math.random() * 6) + 1);
            // System.out.println("A : " + a);
            // System.out.println("B : " + b);

            sum = a + b;
            // System.out.println("Sum : " + sum);
            count++;
            // if (number == sum) {
            // // System.out.println("숫자를 맞췄습니다. 필요한 굴림 횟수는 " + count + " 입니다. 게임을
            // 종료하겠습니다.");
            // break;
            // }
            if (sum > 13 || sum < 1) {
                throw new IllegalArgumentException("2와 12 사이의 숫자가 나와야 합니다! 프로그램이 오류 났습니다.");
            }
        }
        return count;

    }

    public static double averageCount(int number) {
        final int count = 10000;
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += diceCount(number);
        }
        return (double) total / count;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        // printCapitalized("Now is the time to act!");
        // int value = 0;
        // String str = "34A7";
        // for (int i = 0; i < str.length(); i++) {
        // System.out.println(value = value * 16 + hexValue(str.charAt(i)));
        // }
        // diceCount(3);
        for (int i = 2; i <= 12; i++) {
            System.out.println(i + "\t" + averageCount(i));
        }
    }
}
