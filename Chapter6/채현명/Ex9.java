package Chapter6.채현명;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height;

        System.out.print("input : ");
        height = sc.nextInt();

        pyramid(height);
    }

    private static void pyramid(int number) {

        for (int row = 1; row <= number; row++) {
            int count = 1;
            for (int i = 1; i <= number - row; i++)
                System.out.print(" ");

            for (int i = 1; i <= row * 2 - 1; i++) {
                if (i >= row) {
                    System.out.print(count--);
                } else {
                    System.out.print(count++);
                }
            }
            System.out.println();
        }
    }
}
