import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise08_3 {
    public static void printAllLine(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String text = br.readLine();
        while (text != null) {
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == '/' || text.charAt(i) == ';' || text.charAt(i) == '%') {
                    text = text.substring(i + 1);
                    System.out.println(text);
                    break;
                }
            }
            text = br.readLine();
            if (text != null)
                System.out.println(text);

        }
        br.close();
    }

    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        printAllLine(file);

    }
}
