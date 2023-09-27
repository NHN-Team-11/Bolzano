
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WritingOnFile {

    public static void saveArray(String[] v, String filename) throws IOException {
        FileWriter f = new FileWriter(filename);
        PrintWriter out = new PrintWriter(f);
        for (int i = 0; i < v.length; i++) {
            out.println(v[i]);
        }
        out.close();
        f.close();
    }

    public static void saveArray2(String[] v, String filename) throws IOException {
        FileWriter f = new FileWriter(filename);
        PrintWriter p = new PrintWriter(f);

        for (int i = 0; i < v.length; i++) {
            p.println(v[i]);
        }
        p.close();

    }

    public static void main(String[] args) throws IOException {
        // FileWriter f = new FileWriter("test.txt");
        // PrintWriter out = new PrintWriter(f);

        // out.println("some text written on a file");
        // out.print("hi");

        // out.close();
        // f.close();

        // String[] v = { "사과", "파인애플", "포도", "귤", "두리안" };
        // saveArray(v, "과일");

        // FileReader fr = new FileReader("test.txt");
        // BufferedReader br = new BufferedReader(fr);

        // String line = br.readLine();
        // line = br.readLine();
        // System.out.println(line);

        // fr.close();
        // File f1 = new File("garbage.txt");
        // boolean b = f1.delete();
        // System.out.println(b);
        // FileInputStream is = new FileInputStream("data.txt");
        // URL u = new URL("http://www.inf.unibz.it/");
        // InputStream is = u.openStream();

    }
}
