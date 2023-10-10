public class Practice1 {
    public static int fibonacci(int n) {
        int result = 0;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int first = 0;
            int second = 1;
            for (int i = 0; i < n - 1; i++) {
                result = first + second;
                first = second;
                second = result;
            }

            return result;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
