package Chapter6.채현명;

import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        int height;
        Scanner sc = new Scanner(System.in);

        System.out.print("input : ");
        height = sc.nextInt();

        for (int row = 1; row <= height; row++) {
            for (int i = 1; i <= height - row; i++)
                System.out.print(" ");
            for (int i = 1; i <= row * 2 - 1; i++)
                System.out.print("*");
            System.out.println();
        }

    }
}
