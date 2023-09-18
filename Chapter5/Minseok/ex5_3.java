package Chapter5.Minseok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex5_3 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        // 여기서 max 값 구해서 throw new 해서 삼각형 아닐 경우 선택
        if (a + b > c) {
            if (a == b && b == c) {
                System.out.println("정삼각형.");
            } else if (a == b || b == c || c == a) {
                System.out.println("이등변 삼각형.");
            } else if (a * a + b * b == c * c) {
                System.out.println(" 직각 삼각형");
            } else {
                System.out.println("삼각형");
            }
        } else {
            System.out.println("삼각형 아님.");
        }
        br.close();
    }
}
