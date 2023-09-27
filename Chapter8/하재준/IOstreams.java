import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.URL;

public class IOstreams {
    public static void readWrite(InputStream in, OutputStream out) throws IOException {
        InputStreamReader isr = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(isr);
        PrintStream ps = new PrintStream(out);
        String line = br.readLine();
        while (line != null) {
            ps.println(line);
            line = br.readLine();
        }

    }

    public static void main(String[] args) throws IOException {
        System.out.println("*** Internet -> File ***");
        URL u = new URL("http://www.inf.unibz.it/");
        InputStream net = u.openStream();
        File fout = new File("CShome.html");
        FileOutputStream fileos = new FileOutputStream(fout);
        readWrite(net, fileos);
        fileos.close();

        System.out.println("*** File -> Video ***");
        File fin = new File("CShome.html");
        FileInputStream fileis = new FileInputStream(fin);
        readWrite(fileis, System.out);
        fileis.close();

    }
}
