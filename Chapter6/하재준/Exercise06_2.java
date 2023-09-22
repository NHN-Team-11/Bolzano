public class Exercise06_2 {
    public static void evenNumbers(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("enter positive numbers");
        }

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1)
                continue;
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        evenNumbers(10);
    }
}
