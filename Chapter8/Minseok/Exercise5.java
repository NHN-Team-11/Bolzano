package Chapter8.Minseok;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise5 {
    public static String highAverage(String fileName) throws IOException {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String str = br.readLine();
        String highperson = "";
        int max = 0;

        while (str != null) {
            String[] person = str.split(" ");
            String name = person[0];
            int sum = 0;
            double average = 0;
            for (int i = 0; i < person.length; i++) {
                sum += Integer.parseInt(person[i]);
            }
            average = sum / person.length - 1;

            if (average > max) {
                max = (int) average;
                highperson = name;
            }
            str = br.readLine();

        }
        return highperson;

    }

    public static void main(String[] args) throws IOException {
        System.out.println(highAverage("test.txt"));
    }
}
