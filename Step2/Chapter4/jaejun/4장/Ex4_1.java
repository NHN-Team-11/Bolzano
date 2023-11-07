import java.util.Scanner;

public class Ex4_1 {

    static String makeUpperString(String str) {
        String result = "";
        result += str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == ' ') {
                result += Character.toUpperCase(str.charAt(i));
            } else {
                result += str.charAt(i);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = scanner.nextLine();
        str = makeUpperString(str);
        System.out.println(str);

    }
}
