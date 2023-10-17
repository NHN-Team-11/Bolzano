package Chapter9.채현명;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) {

        try {
            int result = divide(2, 0);
            System.out.println("result= " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("System out!");
        }

    }

    public static int divide(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        return a / b;
    }
}
