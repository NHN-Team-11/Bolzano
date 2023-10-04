import java.io.*;

public class Exercise4 {
    public static void main(String[] args) throws IOException {
        int n = 10;
        int[] v = new int[n];
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
    }
}