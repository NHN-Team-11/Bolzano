public class Exercise06_3 {
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

    public static void main(String[] args) {
        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(3));
        System.out.println(factorial(4));
        System.out.println(factorial(5));
    }
}
