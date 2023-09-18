package Chapter5.Minseok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex5_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[4];
        int result = 0;
        // ArrayIndexOutOfBoundsException 해결 방법 고민
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                result++;
            }
        }

        if (result == 0) {
            System.out.println("It is irregular.");
        } else if (result == 1) {
            System.out.println("It is symmetric.");
        } else {
            System.out.println("It is regular.");
        }
        br.close();

    }

}
