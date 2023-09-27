
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.Buffer;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("test.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        FileWriter fw = new FileWriter("test1.txt");
        PrintWriter pw = new PrintWriter(fw);

        String txt = br.readLine();
        while (txt != null) {
            pw.println(txt);
            txt = br.readLine();
        }

        pw.close();
        fw.close();
        is.close();
        br.close();

    }
}
