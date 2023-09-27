package Chapter9.이중민;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * FileNotFoundException 발생
 * IOException 오류 발생
 */
public class Exercise4 {
    public static void main(String[] args) throws IOException {
    int n=10;
    int[] v = new int[n];
    FileReader f = new FileReader("dati.txt");
    BufferedReader in = new BufferedReader(f);
    int i=0;
    String linea = in.readLine();
    while (linea!=null) {
        v[i] = Integer.parseInt(linea);
        linea = in.readLine();
        i++;
    }
    f.close();
    }
}
