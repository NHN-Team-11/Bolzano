package Chapter9.채현명;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;

public class Ex6 {

    private String fileName;

    public Ex6(String fileName) {
        this.fileName = fileName;
    }

    public void readLine() throws ExceptionLineTooLong, IOException {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            int count = 0;

            while ((line = br.readLine()) != null) {
                if (line.length() > 80)
                    throw new ExceptionLineTooLong("This String is too long!");
            }
        } catch (NumberFormatException e) {
            System.out.println("NumberFormat Exception");
        }

    }

    public static void main(String[] args) throws ExceptionLineTooLong, IOException {
        Ex6 e = new Ex6("dati.txt");
        e.readLine(); // 출력이 ExceptionLineTooLong 가 나오게 출력

    }
}
