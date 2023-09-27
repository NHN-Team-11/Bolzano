import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Plural2 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader keyboard = new BufferedReader(isr);
        System.out.print("Insert a word");
        System.out.flush();
        String line = keyboard.readLine();
        System.out.println("The plural of " + line + " is " + line + "s.");

    }
}
