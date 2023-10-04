import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionPropagation1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Insert a number: ");
        int c = Integer.parseInt(br.readLine());
        first(c);
    }

    private static void first(int a) throws Exception {
        second(a);
    }

    private static void second(int b) throws Exception {
        Exception propagate = new Exception("The value is too small.");
        if (b < 10)
            throw propagate;
        System.out.println("OK");
    }
}
