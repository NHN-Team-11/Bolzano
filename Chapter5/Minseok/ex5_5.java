package Chapter5.Minseok;

import java.util.Scanner;

public class ex5_5 {
    public static void main(String[] args) {
        double a, b, c;
        double m;
        double root1, root2;

        Scanner sc = new Scanner(System.in);

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        m = b * b - 4 * a * c;
        System.out.println(a + "x**2" + " + " + b + "x" + " + " + c);

        if (m > 0) {
            root1 = (-b + Math.sqrt(m)) / (2 * a);
            root2 = (-b - Math.sqrt(m)) / (2 * a);
            System.out.println("근은 " + root1 + "과 " + root2 + "입니다.");
        } else if (m == 0) {
            root1 = -b / (2 * a);
            System.out.println("중근은 " + root1 + "입니다.");
        } else {
            System.out.println("실근이 존재하지 않습니다.");
        }

        sc.close();

    }

}
