import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PrintIntegers {
    PrintIntegers(String filename) {
        try {
            FileReader f = new FileReader(filename);
            BufferedReader in = new BufferedReader(f);
            String line = in.readLine();
            while (line != null) {
                try {
                    int n = (Integer.parseInt(line));
                    System.out.println(n);
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                }
                line = in.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        PrintIntegers p = new PrintIntegers("data.txt");

    }
}
