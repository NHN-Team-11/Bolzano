package Chapter8.채현명;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex5 {
    public static String highAverage(String fileName) throws IOException {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        double max = 0;
        String studentName = "";

        while (line != null) {
            String[] stdNumber = line.split(" ");
            String name = stdNumber[0];
            int sum = 0;
            double average = 0;

            for (int i = 1; i < stdNumber.length; i++) {
                sum += Integer.parseInt(stdNumber[i]);
            }
            average = sum / stdNumber.length - 1;

            if (average > max) {
                max = average;
                studentName = name;
            }

            line = br.readLine();

        }

        return studentName;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(highAverage("test.txt"));
    }
}
