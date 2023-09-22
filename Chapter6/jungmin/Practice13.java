package Chapter6.jungmin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice13 {

    public static StringBuilder solution (StringBuilder sb, int n) {
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
        return sb;
    }

    public static void primeNumbers(int n) {
        StringBuilder sb = new StringBuilder();
        solution(sb, n);
        System.out.println(sb);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        primeNumbers(n);
    }
}
