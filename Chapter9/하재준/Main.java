import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int a, b, x;
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader kb = new BufferedReader(is);
        a = 10;
        b = Integer.parseInt(kb.readLine());
        System.out.println(a / b);
    }
}
