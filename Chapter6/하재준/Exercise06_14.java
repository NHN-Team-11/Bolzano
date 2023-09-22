public class Exercise06_14 {
    static void getPrimeFactors(int n) {
        while (n != 1) {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    System.out.println(i + " ");
                    n /= i;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        getPrimeFactors(220);
    }
}
