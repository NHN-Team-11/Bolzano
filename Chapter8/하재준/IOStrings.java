import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;

public class IOStrings {
    static String[] loadArray(InputStream is, int n) throws IOException {
        String[] result = new String[n];
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        for (int i = 0; i < result.length; i++) {
            result[i] = br.readLine();
        }
        return result;
    }

    static void saveArray(OutputStream os, String[] sa) {
        PrintStream ps = new PrintStream(os);
        for (int i = 0; i < sa.length; i++) {
            ps.println(sa[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        OutputStream os = System.out;
        saveArray(os, loadArray(is, 5));
    }
}
