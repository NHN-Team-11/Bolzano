package Chapter8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.annotation.processing.Filer;

public class Exercise3 {
    public static void printLine(String fileName) throws IOException{
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while(line != null) {
            if(line.charAt(0) == '/' || 
            line.charAt(0) == ';' ||
            line.charAt(0) == '%') {
                System.out.println(line);
            }
            line = br.readLine();
        }
    }
    public static void main(String[] args) throws IOException {
        printLine("test.txt");
    }
}
