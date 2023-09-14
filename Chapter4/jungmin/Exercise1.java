package Bolzano.Chapter4.jungmin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise1 {
    private static final double Euro = 1423.27;
    public static double convertLireEuro(int x) {
        return x * Euro;
    }

    public static boolean sumOverflow(byte x, byte y) {
        short result = (short) (x + y);
        if(result > Byte.MAX_VALUE) {
            return true;
        }
        return false;
    }

    public static boolean even(long x) {
        if(x % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(sumOverflow((byte)100, (byte)100));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        System.out.println("산술 평균 : " + (x + y) / 2);
        System.out.println("기하 평균 : " + Math.sqrt(x));
        System.out.println("더 큰 숫자 : " + Math.max(x, y));
        System.out.println("더 작은 숫자 : " + Math.min(x, y));

        System.out.println(even(x));
    }
}