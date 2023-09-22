public class Exercise06_12 {
    static void allPrimeNumbers(int n) {
        for (int i = 2; i < n + 1; i++) {
            if (Exercise06_11.isPrime(i) == true) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        allPrimeNumbers(18);
    }
}
