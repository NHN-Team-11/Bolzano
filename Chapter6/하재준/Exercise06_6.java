import java.util.Scanner;

public class Exercise06_6 {
    static String decode(String message, int key) {
        String result = "";
        char c;
        int ci;

        for (int i = 0; i < message.length(); i++) {
            c = message.charAt(i);
            ci = (int) c;
            ci = ci - key;
            c = (char) ci;
            result = result + String.valueOf(c);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.print("enter message: ");
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        System.out.print("enter a key(num): ");
        int key = sc.nextInt();
        System.out.println(decode(message, key));
    }
}
