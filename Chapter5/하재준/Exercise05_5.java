import java.util.Scanner;

public class Exercise05_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이차 방정식의 계수 a,b,c 를 입력하세요 : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double x = ((-b) + Math.abs(Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a);
        if (Math.pow(b, 2) - (4 * a * c) > 0) {
            System.out.println("두 개의 실근 ");
            System.out.println(x);
            System.out.println(-x);
        } else if (Math.pow(b, 2) - (4 * a * c) == 0) {
            System.out.println("두 개의 중근 ");
            System.out.println(x);
            System.out.println(-x);
        } else {
            System.out.println("두 개의 허근 ");
            System.out.println(x);
            System.out.println(-x);
        }
    }
}
