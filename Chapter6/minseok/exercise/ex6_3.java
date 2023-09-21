package Chapter6.minseok.exercise;

public class ex6_3 {
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n은 음수가 되면 안됩니다.");
        } else if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }

    public static void main(String[] args) {
        System.out.println(ex6_3.factorial(15));
    }

}
