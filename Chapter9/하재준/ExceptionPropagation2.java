import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionPropagation2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Insert a number:");
        int c = Integer.parseInt(br.readLine());
        first(c);
    }

    private static void first(int a) {
        try {
            second(a);
        } catch (Exception e) {
            System.out.println("Exception handled in the first method.");
            System.out.println(e.getMessage());
        }
    }

    private static void second(int b) throws Exception {
        Exception propagate = new Exception("The value is too small");
        if (b < 10) {
            throw propagate;
        }
        System.out.println("OK");
    }
}
