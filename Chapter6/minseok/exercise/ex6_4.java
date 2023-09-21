package Chapter6.minseok.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex6_4 {
    public static void sum(int n) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int positiveresult = 0;
        int negativeresult = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num > 0) {
                positiveresult += num;
            } else {
                negativeresult += num;
            }

        }
        System.out.println("양수일때 합 : " + positiveresult + ", " + "음수일 때 합: " + negativeresult);
    }

    public static void main(String[] args) throws IOException {
        ex6_4.sum(10);
    }

}
