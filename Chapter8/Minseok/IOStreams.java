package Chapter8.Minseok;

import java.io.*;
import java.net.*;

public class IOStreams {

    public static void readWrite(InputStream in, OutputStream out)
            throws IOException {
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
        // Reads from the Internet and writes to a file
        System.out.println("*** Internet -> File ***");
        URL u = new URL("http://www.inf.unibz.it/");
        InputStream net = u.openStream();
        File fout = new File("CShome.html");
        FileOutputStream fileos = new FileOutputStream(fout);
        readWrite(net, fileos);
        fileos.close();

        // Reads from a file and writes to video
        System.out.println("*** File -> Video ***");
        File fin = new File("CShome.html");
        FileInputStream fileis = new FileInputStream(fin);
        readWrite(fileis, System.out);
        fileis.close();
    }
}