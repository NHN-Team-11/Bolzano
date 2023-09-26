package Chapter9.Minseok;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

public class Exercise5 {

    private String fileName;

    public Exercise5(String fileName) {
        this.fileName = fileName;
    }

    public int countLines() {
        int count = 0;

        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String str = br.readLine();
            while (str != null) {
                count++;
                str = br.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return count;

    }

    public void write(OutputStream os) {
        try {
            FileInputStream fis = new FileInputStream(fileName);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            PrintWriter pw = new PrintWriter(os);
            pw.write(br.readLine());
            pw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void print() {
        try {
            FileInputStream fis = new FileInputStream(fileName);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String str = br.readLine();
            while (str != null) {
                System.out.println(str);
                str = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void copy(String fileName) {
        try {

            FileWriter fw = new FileWriter(fileName, true);
            PrintWriter pw = new PrintWriter(fw);

            FileInputStream fis = new FileInputStream(this.fileName);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));

            String str = br.readLine();

            while (str != null) {
                pw.println(str);
                str = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete() throws IOException {
        File f1 = new File(fileName);
        boolean b = f1.delete();
    }

    public static void main(String[] args) {
        try {
            Exercise5 ex = new Exercise5("test1.txt");
            ex.print();
            ex.copy("test.txt");
            ex.delete();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
