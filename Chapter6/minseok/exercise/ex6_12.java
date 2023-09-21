package Chapter6.minseok.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex6_12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        for (int i = 2; i < num; i++) {
            if (ex6_11.predicate(i)) {
                sb.append(i).append(" ");
            }

        }
        System.out.println(sb);
    }

}
