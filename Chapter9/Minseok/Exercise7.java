package Chapter9.Minseok;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exercise7 {

    public static boolean fileExists(String fileName) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }
    }

    public static boolean isInt(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isDouble(String number) {
        try {
            Double.parseDouble(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
