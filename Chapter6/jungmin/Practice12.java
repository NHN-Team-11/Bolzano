package Chapter6.jungmin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice12 {

    public static StringBuilder solution(int num, StringBuilder sb) {
        for (int i = 2; i < num; i++) {
            if(Practice11.indicate(i)) {
                sb.append(i).append(" ");
            }
        }
        return sb;
    }

    public static void printAllPrimeNumber(int n) {
        StringBuilder sb = new StringBuilder();
        solution(n, sb);
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        printAllPrimeNumber(num);
    }
}
