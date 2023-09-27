import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFile {
    public static void main(String[] args) throws IOException {
        FileReader f = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(f);

        String line = br.readLine();
        System.out.println(line);

        f.close();
        br.close();
    }
}
