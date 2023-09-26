package Chapter8.채현명;

import java.io.*;

public class Ex1 {

    public static String[] loadArray(InputStream is, int n) throws IOException {
        InputStreamReader isrd = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isrd);

        String[] arr = new String[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = br.readLine();
        }
        return arr;

    }

    public static void saveArray(OutputStream os, String[] sa) {
        PrintStream ps = new PrintStream(os);
        for (int i = 0; i < sa.length; i++) {
            ps.println(sa[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        OutputStream os = System.out;

        saveArray(os, loadArray(is, 4));

    }

}
