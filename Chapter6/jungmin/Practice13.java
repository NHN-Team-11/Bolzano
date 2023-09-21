package Bolzano.Chapter6.jungmin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 2; i < Integer.MAX_VALUE; i++) {
            if(Practice11.indicate(i)) {
                sb.append(i).append(" ");
                count++;
            }
            if(count == n) {
                break;
            }
        }
        System.out.println(sb);
    }
}
