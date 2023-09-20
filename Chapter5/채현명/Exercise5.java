package Chapter5.채현명;

import java.util.Scanner;

class Exercise5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a input : ");
        int a = scanner.nextInt();

        System.out.print("b input : ");
        int b = scanner.nextInt();

        System.out.print("c input : ");
        int c = scanner.nextInt();

        double x = ((-b) + Math.abs(Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a);

        boolean first = Math.pow(b, 2) - (4 * a * c) > 0;
        boolean second = Math.pow(b, 2) - (4 * a * c) == 0;

        if (first) {
            System.out.println("실근 : " + x + "-실근 : " + -x);
        } else if (second) {
            System.out.println("중근 : " + x + " -중근 " + -x);
        } else {
            System.out.println("허근 : " + x + "- 허근" + -x);
        }

    }
}