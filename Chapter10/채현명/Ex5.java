package Chapter10.채현명;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex5 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("dati.txt"))) {
            System.out.println(countOnes(br));
        } catch (NoSuchFieldError e) {
            System.out.println("파일이 존재하지 않습니다.");
        }
    }

    public static int countOnes(BufferedReader br) throws IOException {
        String line = br.readLine();

        if (line == null) {
            return 0;
        } else {
            int onesInLine = 0;
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == '1')
                    onesInLine++;
            }
            return onesInLine + countOnes(br);
        }
    }
}
