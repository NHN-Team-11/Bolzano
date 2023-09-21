package Chapter6.minseok.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Chapter6.jungmin.Practice11;

public class ex6_14 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int div = 2;
        for (int i = 0; i <= n; i++) {

            if (ex6_11.predicate(div) && n % div == 0) {
                sb.append(div).append(" ");
                n = n / div;
            } else {
                div++;
            }
        }

        System.out.println(sb);

    }
}
