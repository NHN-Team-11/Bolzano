package Chapter5.Minseok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exercise {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double g = Double.parseDouble(br.readLine());

        if (g > 40) {
            System.out.println("g is extra strong liquor.");
        } else if (20 < g && g <= 40) {
            System.out.println("g is strong liquor.");
        } else if (15 < g && g <= 20) {
            System.out.println("g is liquor.");
        } else if (12 < g && g <= 15) {
            System.out.println("g is strong vine.");
        } else if (10.5 < g && g <= 12) {
            System.out.println("g is normal vine.");
        } else {
            System.out.println(" g is light vine");
        }
        br.close();
    }

}
