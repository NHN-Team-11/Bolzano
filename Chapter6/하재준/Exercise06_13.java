public class Exercise06_13 {
    static int getPrimeNumbers(int n) {
        int count = 0;
        for (int i = 2; i < n + 1; i++) {
            if (Exercise06_11.isPrime(i) == true) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(getPrimeNumbers(18));
    }
}
