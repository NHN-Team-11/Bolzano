package Chapter8.Minseok;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise3 {

    public static void printLine(String fileName) throws IOException {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String str = br.readLine();

        while (str != null) {
            if (str.charAt(0) == '/' || str.charAt(0) == ';' || str.charAt(0) == '%') {
                System.out.println(str);
            }
            str = br.readLine();
        }
        br.close();
    }

    public static void main(String[] args) throws IOException {
        printLine("test.txt");
    }

}
