import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Exercise6 {
    public static void main(String[] args) throws IOException, RuntimeException {

        try {
            InputStream is = new FileInputStream("test.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line = br.readLine();
            while (line != null) {
                if (line.length() > 80) {
                    throw new ExceptionLineTooLong();
                }
                System.out.println(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException f) {
            System.out.println("file not found");
        }

    }
}