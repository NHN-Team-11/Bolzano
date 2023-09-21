package Chapter6.채현명;

public class Ex3 {
    public static void main(String[] args) {
        factorial(0);
    }

    private static void factorial(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("0보다 큰 값이 와야합니다.");
        }
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac *= i;
        }
        System.out.println("factorial = " + fac);
    }
}
