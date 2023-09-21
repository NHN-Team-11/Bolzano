package Chapter6.채현명;

public class Ex3 {
    public static void main(String[] args) {
        factorial(4);
    }

    private static void factorial(int inputNumber) {
        System.out.print(inputNumber + "Factorial = ");
        int result = 1;
        for (int i = 1; i <= inputNumber; i++) {
            result = result * i;
        }
        System.out.print(result);
    }

}
