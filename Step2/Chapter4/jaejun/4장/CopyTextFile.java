import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class CopyTextFile {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // InputStream is = new FileInputStream(args[0]);
        // OutputStream os = new FileOutputStream(args[1]);

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
        FileWriter fw = new FileWriter(args[1]);
        BufferedWriter bw = new BufferedWriter(fw);
        String line = "";
        while ((line = br.readLine()) != null) {
            bw.write(line, 0, line.length());
            bw.write(10);

        }
        br.close();
        bw.close();
    }
}
