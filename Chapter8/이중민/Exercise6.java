package Chapter8.이중민;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

public class Exercise6 {
    private String fileName;
    public Exercise6(String fileName) {
        this.fileName = fileName;
    }

    public int countLines() throws IOException {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();

        int count = 0;
        while(line != null) {
            count++;
            line = br.readLine();
        }

        return count;
    }

    public void write(OutputStream os) throws IOException{
        FileInputStream fis = new FileInputStream(fileName);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        PrintWriter pw = new PrintWriter(os);
        pw.write(br.readLine());
        pw.close();
    }
    public void print() throws IOException {
        FileInputStream fis = new FileInputStream(fileName);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        String line = br.readLine();
        while(line != null) {
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
    }

    public void copy(String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName, true);
        PrintWriter pw = new PrintWriter(fw);

        FileInputStream fis = new FileInputStream(this.fileName);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        String line = br.readLine();
        while(line != null) {
            pw.println(line);
            line = br.readLine();
        }
        pw.close();
        br.close();
    }

    public void delete() throws IOException {
        File f1 = new File(fileName);
        boolean b = f1.delete();
    }

    public static void main(String[] args) throws IOException{
        Exercise6 e = new Exercise6("test2.txt");
        OutputStream os = System.out;
        e.print();
        e.copy("test.txt");
        e.delete();
    }



}
