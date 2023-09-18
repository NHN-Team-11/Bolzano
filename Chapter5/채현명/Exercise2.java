package Chapter5.채현명;

import java.util.Scanner;

//2번 3번
public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lengthFirst, lengthSecond, lengthThird;

        System.out.print("첫 번째 변의 길이를 입력해 주세요: ");
        lengthFirst = scanner.nextDouble();
        System.out.println();

        System.out.print("두 번째 변의 길이를 입력해 주세요: ");
        lengthSecond = scanner.nextDouble();
        System.out.println();

        System.out.print("세 번째 변의 길이를 입력해 주세요: ");
        lengthThird = scanner.nextDouble();
        System.out.println();

        boolean isPair0 = true;
        boolean isPair1 = lengthFirst == lengthSecond || lengthFirst == lengthThird || lengthSecond == lengthThird;

        if (isPair0) {
            System.out.println("It is irregular! ");
        } else if (isPair1) {
            System.out.println("It is symetric");
        } else {
            System.out.println("It is regular");
        }

    }
}
