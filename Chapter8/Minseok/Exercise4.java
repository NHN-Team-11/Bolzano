package Chapter8.Minseok;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercise4 {

    public static void calculator(String fileName, int n) throws IOException {
        FileWriter fw = new FileWriter(fileName, true);
        PrintWriter pw = new PrintWriter(fw);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                pw.print(String.valueOf(i * j) + " ");
            }
            pw.println();
        }
        pw.close();
    }

    public static void main(String[] args) throws IOException {
        calculator("text.txt", 5);
    }

}
