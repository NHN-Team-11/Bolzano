package Chapter9.채현명;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class Ex7 {

    public static boolean fileExists(String inputFile) throws FileNotFoundException {
        File file = new File(inputFile);

        if (!file.exists())
            throw new FileNotFoundException("No such File!");
        return true;
    }

    public static boolean isInt(String isIntNumber) throws IOException {
        try {
            Integer.parseInt(isIntNumber);
        } catch (NumberFormatException e) {
            System.out.println("Can not invert Intger!");
            return false;
        }
        return true;
    }

    public static boolean isDouble(String isDoubleNumber) {

        try {
            Double.parseDouble(isDoubleNumber);
        } catch (NumberFormatException e) {
            System.out.println("Can not invert Double!");
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(isDouble("122.22"));
        System.out.println(isInt("13"));
        System.out.println(fileExists("asdadasd.txt"));
    }

}
