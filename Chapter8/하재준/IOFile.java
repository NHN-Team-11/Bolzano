import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

public class IOFile {
    private String filename;

    IOFile(String filename) {
        this.filename = filename;
    }

    int countLines() throws IOException {
        InputStream is = new FileInputStream(this.filename);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String str = br.readLine();
        int count = 0;
        while (str != null) {
            count++;
            str = br.readLine();
        }
        return count;
    }

    void write(OutputStream os) throws IOException {
        InputStream is = new FileInputStream(this.filename);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        PrintWriter pw = new PrintWriter(os);
        String str = br.readLine();

        while (str != null) {
            pw.write(str);
            str = br.readLine();
        }
    }

    void print() throws IOException {
        InputStream is = new FileInputStream(this.filename);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String str = br.readLine();

        while (str != null) {
            System.out.println(str);
            str = br.readLine();
        }
        br.close();
    }

    void copy(String filename) throws IOException {
        FileWriter fw = new FileWriter(filename);
        PrintWriter pw = new PrintWriter(fw);

        InputStream is = new FileInputStream(this.filename);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String str = br.readLine();

        while (str != null) {
            pw.println(str);
            str = br.readLine();
        }
        pw.close();
        br.close();
    }

    void delete() {
        File f1 = new File(this.filename);
        boolean b = f1.delete();
    }

    public static void main(String[] args) throws IOException {
        IOFile ioFile = new IOFile("test.txt");
        ioFile.print();
        System.out.println(ioFile.countLines());
        ioFile.copy("test1.txt");
        ioFile.write(System.out);
    }
}
