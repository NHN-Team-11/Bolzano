public class Exercise06_10 {
    public static int factorial(int n) {
        int result = 1;

        if (n < 0) {
            throw new IllegalArgumentException("Enter a positive number");
        }
        if (n == 0 || n == 1) {
            return n;
        }

        for (int i = n; i > 0; i--) {
            result = result * i;
        }

        return result;
    }

    public static void factorialList(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println(factorial(i));

        }
    }

    public static void main(String[] args) {
        int n = 5;
        factorialList(n);

    }
}
