import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UseMyException extends Exception {
    UseMyException(String message) {
        super(message);
    }

    public static void main(String[] args) throws IOException, UseMyException {
        int min = 10;
        int max = 30;
        int value;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // System.out.println("Input a number between " + min + " and " + max +
        // "included");
        // int value = Integer.parseInt(br.readLine());
        // if (value < min || value > max) {
        // throw new UseMyException("The value is not in the allowed interval");
        // }
        // System.out.println("The value is in the allowed interval");
        try {
            value = Integer.parseInt(br.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Catched NumberFormatException");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Catched IOException");
            System.out.println(e.getMessage());
        }

    }
}
