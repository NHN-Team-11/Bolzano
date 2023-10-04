import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exercise7 {
    public static boolean fileExist(String fileName) throws IOException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException("File Not found");
        }
        return true;
    }

    public static boolean isInt(String str) {
        try {
            Integer.parseInt(str);
        } catch (IllegalArgumentException e) {
            System.out.println("Is Not Int");
            return false;
        }
        return true;
    }

    public static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
        } catch (IllegalArgumentException e) {
            System.out.println("Is Not Double");
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        // System.out.println(fileExist("test2.txt"));
        System.out.println(isInt("hi"));
        System.out.println(isDouble("hi"));
    }
}