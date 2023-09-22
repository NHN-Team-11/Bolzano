package Chapter6.jungmin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice14 {

    public static StringBuilder solution(StringBuilder sb, int n) {
        int divide = 2;
        while(n > 1) {
            
            if(Practice11.indicate(divide) && n % divide == 0) {
                sb.append(divide).append(" ");
                n /= divide;
            }
            else {
                divide++;
            }
        }
        return sb;
    }

    public static void printFactorization(int n) {
        StringBuilder sb = new StringBuilder();
        solution(sb, n);
        System.out.println(sb);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        printFactorization(n);

    }
}
