package Chapter8.채현명;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex4 {
    public static void matrixMulti(String fileName, int n) throws IOException {
        FileWriter fw = new FileWriter(fileName, true);
        PrintWriter pw = new PrintWriter(fileName);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                pw.print(String.valueOf(i * j) + " ");
            }
            pw.println();
        }
        pw.close();
    }

    public static void main(String[] args) throws IOException {
        matrixMulti("test.txt", 3);
    }
}
