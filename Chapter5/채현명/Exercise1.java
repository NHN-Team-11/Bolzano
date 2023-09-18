package Chapter5.채현명;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input alcohol degree : ");
        int alcohol = scanner.nextInt();

        if (40 < alcohol)
            System.out.println("extra strong liquor");
        else if (20 < alcohol)
            System.out.println("strong liquor");
        else if (15 < alcohol)
            System.out.println("liquor");
        else if (12 < alcohol)
            System.out.println("strong vine");
        else if (10.5 < alcohol)
            System.out.println("normal vine");
        else
            System.out.println("light vine");
    }
}
