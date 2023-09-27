import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Plural {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Insert a word:");
        String line = br.readLine();
        System.out.print(line);
        System.out.println("s");
        System.out.println();
    }
}
