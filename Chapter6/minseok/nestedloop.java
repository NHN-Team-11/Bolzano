package Chapter6.minseok;

import java.util.Scanner;

public class nestedloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height;
        height = sc.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // System.out.println(nestedloop.power(2, 6));
    }

    // public static int power(int base, int exponent) {
    // int result = 1;
    // int multiplicand, multiplicator, product;

    // while (exponent > 0) {
    // exponent--;

    // // result = result * base
    // multiplicand = result;
    // multiplicator = base;
    // product = 0;
    // while (multiplicator > 0) {
    // multiplicator--;
    // product = product + multiplicand;
    // }
    // result = product;
    // }
    // return result;
    // }

}
