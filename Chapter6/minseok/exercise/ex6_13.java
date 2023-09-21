package Chapter6.minseok.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex6_13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (ex6_11.predicate(i)) {
                sb.append(i).append(" ");
                count++;
            }
            if (num == count) {
                break;
            }

        }
        System.out.println(sb);
    }

}
