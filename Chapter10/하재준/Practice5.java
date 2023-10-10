import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Practice5 {
    public static int appearOne(BufferedReader br) throws NumberFormatException, IOException {
        String line = br.readLine();
        if (line == null) {
            return 0;
        }
        int num = Integer.parseInt(line);
        if (num == 1) {
            return 1 + appearOne(br);
        } else {
            return appearOne(br);
        }

    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        System.out.println(appearOne(br));
    }
}
