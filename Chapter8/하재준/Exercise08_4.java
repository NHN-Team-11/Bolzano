
import java.io.FileWriter;
import java.io.IOException;

import java.io.PrintWriter;

public class Exercise08_4 {
    public static void writeMulti(String filename, int n) throws IOException {
        FileWriter f = new FileWriter(filename);
        PrintWriter out = new PrintWriter(f);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                out.print(i * j + " ");
            }
            out.println();
        }

        out.close();
        f.close();

    }

    public static void main(String[] args) throws IOException {
        String filename = "mutl.txt";
        writeMulti(filename, 3);
    }
}
