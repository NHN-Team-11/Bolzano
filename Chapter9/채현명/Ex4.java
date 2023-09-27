package Chapter9.채현명;

import java.io.*;

public class Ex4 {

    public static void main(String[] args) throws IOException {
        int n = 10;
        int[] v = new int[n];

        try {
            FileReader f = new FileReader("dati.txt");
            BufferedReader in = new BufferedReader(f);
            int i = 0;
            String linea = in.readLine();
            while (linea != null) {
                v[i] = Integer.parseInt(linea);
                linea = in.readLine();
                i++;
            }
            f.close();
        } catch (IOException e) {
            System.out.println("IOE exception!");
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception!");
        }
    }
}