import java.util.Scanner;

public class Exercise05_3 {
    static String checkTriagle(int a, int b, int c) {
        if (a == b) {
            if (b == c) {
                return "regular";
            } else {
                return "symmetric";
            }
        } else {
            if (a == c) {
                return "symmetric";
            } else if (b == c) {
                return "symmetric";
            } else {
                return "irregular";
            }
        }
    }

    static String checkTriagle2(int a, int b, int c) {
        if (a == b && b == c && a == c) {
            return "regular";
        } else if ((a == b && b != c) || (b == c && a != b) || (a == c && a != b)) {
            return "symmetric";
        } else {
            return "irregular";
        }
    }

    public static void main(String[] args) {
        System.out.print("삼각형의 세 변을 입력해주세용 : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(checkTriagle2(a, b, c));

    }
}
