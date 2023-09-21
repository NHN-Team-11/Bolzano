package Chapter6.jungmin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice2 {
    public static StringBuilder even(StringBuilder sb, int n) {
        for (int i = 0; i <= n; i++) {
            if(i % 2 == 0) {
                sb.append(i).append(" ");
            }
        }
        return sb;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        System.out.println(even(sb, Integer.parseInt(br.readLine())));
    }    
}
