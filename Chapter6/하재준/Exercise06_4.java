import java.util.Scanner;

public class Exercise06_4 {
    public static void sequence(int length) {
        int result = 0;
        for (int i = 0; i < length + 1; i++) {
            result += i;
        }
        System.out.println("the sum of the positive : " + result);
        System.out.println("the sum of the negative : " + -result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n을 입력하세요: ");
        int length = sc.nextInt();
        sequence(length);
    }

}
