package Chapter8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercise7 {
    private String fileName;

    public Exercise7(String fileName) {
        this.fileName = fileName;
    }

    public void interests(double rate) throws IOException {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        FileWriter fw = new FileWriter(fileName);
        PrintWriter pw = new PrintWriter(fw);

        while (line != null) {
            String[] list = line.split(" ");
            list[2] = String.valueOf(Double.valueOf(list[2]) * (rate / 100.0));
            
        }
    }
}
