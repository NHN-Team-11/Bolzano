package Chapter6.채현명;

public class Ex12 {
    public static void main(String[] args) {

        printAllPrimeNumber(10);
    }

    private static void printAllPrimeNumber(int inputNumber) {
        System.out.print(inputNumber + " 까지 소수인 숫자 : ");
        for (int i = 2; i <= inputNumber; i++) {
            if (Ex11.isprime(i)) {
                System.out.print(i + " ");
            }
        }
    }

}
