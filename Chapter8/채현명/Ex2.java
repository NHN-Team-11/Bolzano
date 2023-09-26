package Chapter8.채현명;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2 {
    public static double input(BufferedReader br) throws NumberFormatException, IOException {
        double sum = 0;
        int count = 0;
        int num;

        do {
            System.out.print("Enter a positive integer (0 to stop): ");
            num = Integer.parseInt(br.readLine());

            if (num > 0) {
                sum += num;
                count++;
            } else if (num < 0) {
                System.out.println("Please enter a positive integer.");
            }
        } while (num != 0);

        return sum / count;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double sum = input(br);
        System.out.println(sum);
    }
}
