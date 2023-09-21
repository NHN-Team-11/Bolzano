package Chapter6.minseok.exercise;

public class ex6_9 {
    public static void pyramid(int n) {
        if (n > 9) {
            throw new IllegalArgumentException("9보다 크면 안돼요");
        }

        for (int i = 0; i < n; i++) {
            int result = 1;
            for (int number = 1; number <= n - i; number++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 + 1; j++) {
                if (j > i) {
                    System.out.print(result--);
                } else {
                    System.out.print(result++);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pyramid(5);
    }

}
