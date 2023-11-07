import java.util.Scanner;

public class Ex4_2 {

    static int hexValue(char c) {
        switch ((int) c) {
            case (int) '0':
                return 0;
            case (int) '1':
                return 1;
            case (int) '2':
                return 2;
            case (int) '3':
                return 3;
            case (int) '4':
                return 4;
            case (int) '5':
                return 5;
            case (int) '6':
                return 6;
            case (int) '7':
                return 7;
            case (int) '8':
                return 8;
            case (int) '9':
                return 9;
            case (int) 'A':
                return 10;
            case (int) 'B':
                return 11;
            case (int) 'C':
                return 12;
            case (int) 'D':
                return 13;
            case (int) 'E':
                return 14;
            case (int) 'F':
                return 15;
            default:
                return -1;
        }
    }

    static int toHexadecimal(String str) {
        int value = 0;
        int result = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + ((int) Math.pow(16, value) * hexValue(str.charAt(i)));
            value++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("16진수를 입력해주세요 :");
        String str = scanner.nextLine();
        System.out.println(toHexadecimal(str));
        scanner.close();
    }
}
