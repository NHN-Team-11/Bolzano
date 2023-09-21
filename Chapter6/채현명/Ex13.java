package Chapter6.채현명;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 n을 입력하세요: ");
        int n = scanner.nextInt();

        System.out.print(n + "개의 소수 : ");
        int count = 0;
        int number = 2;

        while (count < n) {
            if (Ex11.isprime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }

        scanner.close();
    }
}
