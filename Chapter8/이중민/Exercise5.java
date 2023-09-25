package Chapter8.이중민;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise5 {
    public static String highAveragePerson(String fileName) throws IOException {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        double max = 0;
        String highPersonName = "";
        
        while(line != null) {
            String[] person = line.split(" ");
            String name = person[0];
            int sum = 0;
            double average = 0;
            for (int i = 1; i < person.length; i++) {
                sum += Integer.parseInt(person[i]);
            }
            average = sum / person.length - 1;
            if(average > max) {
                max = average;
                highPersonName = name;
            }
            line = br.readLine();
        }
        return highPersonName;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(highAveragePerson("test.txt"));
    }
}
