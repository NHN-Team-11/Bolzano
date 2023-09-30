package Chapter10.채현명;

/*
 * Ex1, Ex2, Ex3, Ex4
 */
public class Ex1 {
    public static int fibonacci(int n) {

        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int Ackermann(int m, int n) {
        if (m == 0)
            return n + 1;
        else if (n == 0)
            return Ackermann(m - 1, n);
        return Ackermann(m - 1, Ackermann(m, n - 1));
    }

    public static double gcd(double m, double n) {
        if (n == 0)
            return m;
        return gcd(n, m % n);
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci = " + fibonacci(3));
        System.out.println("Ackerman = " + Ackermann(2, 1));
        System.out.println("GCD = " + gcd(10, 2));
    }

}
