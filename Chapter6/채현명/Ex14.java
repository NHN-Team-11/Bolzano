package Chapter6.채현명;

public class Ex14 {
    public static void main(String[] args) {
        printFactorization(220);
    }

    private static void printFactorization(int inputNumber) {
        if (inputNumber <= 0) {
            throw new IllegalArgumentException("음수는 안됩니다.");
        }

        for (int i = 2; i <= inputNumber; i++) {
            while (inputNumber % i == 0 && Ex11.isprime(i)) {
                System.out.print(i + " ");
                inputNumber /= i;
            }
        }
    }

}
