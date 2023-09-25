package Chapter8.Minseok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise2 {

    public static double average(BufferedReader br) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int count = 0;
        while (n != 0) {
            sum += n;
            count++;
            n = Integer.parseInt(br.readLine());
        }
        return sum / count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(average(br));
    }

}
