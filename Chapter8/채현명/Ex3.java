package Chapter8.채현명;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex3 {

    public static void main(String[] args) throws IOException {
        fileName("test.txt");
    }

    public static void fileName(String file) throws IOException {
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while (line != null) {
            if (line.charAt(0) == '/' ||
                    line.charAt(0) == ';' ||
                    line.charAt(0) == '%') {
                System.out.println(line);
            }
            line = br.readLine();
        }
    }
}
