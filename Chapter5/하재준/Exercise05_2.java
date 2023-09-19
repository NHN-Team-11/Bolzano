import java.util.Scanner;

public class Exercise05_2 {
    static int pairCheck(int a, int b, int c) {
        if (a == b) {
            if (b == c) {
                return 2;
            } else {
                return 1;
            }
        } else {
            if (a == c) {
                return 1;
            } else if (b == c) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("삼각형의 세 변을 입력해주세용 : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int pair = pairCheck(a, b, c);
        triagleCheck(pair);

    }

    private static void triagleCheck(int pair) {
        if (pair == 0) {
            System.out.println("it is irregular");
        } else if (pair == 1) {
            System.out.println("it is symmetric");
        } else {
            System.out.println("it is irregular");
        }
    }
}
