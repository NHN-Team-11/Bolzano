package Chapter6.채현명;

public class Ex10 {
    public static void main(String[] args) {
        printFactorial(4);
    }

    private static void printFactorial(int inputNumber) {
        int result = 1;
        System.out.print(inputNumber + "Factorial = ");
        for (int i = inputNumber; i >= 1; i--) {
            System.out.print(i);
            result = result * i;

            if (i > 1) {
                System.out.print(" * ");
            }
        }
        System.out.print(" = " + result);
    }

}
