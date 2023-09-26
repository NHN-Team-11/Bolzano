package Chapter9.Minseok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise6 {

    public static void ExceptionLineTooLong(String str) throws Exception {
        Exception e = new Exception("The strings is too long");
        if (str.length() > 80) {
            throw e;
        }
        System.out.println("Good");

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        ExceptionLineTooLong(str);
    }
}