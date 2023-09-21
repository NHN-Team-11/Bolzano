package Chapter6.jungmin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice14 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
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
        System.out.println(sb);

    }
}
