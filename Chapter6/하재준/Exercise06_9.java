public class Exercise06_9 {
    public static void star(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k > i) {
                    System.out.print(-(k + (-2 * i)));
                } else {
                    System.out.print(k);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        star(4);
        star(5);
    }
}
