public class Practice3 {
    public static int Ackermann(int m, int n) {
        if (m == 0) {
            return n + 1;
        }
        if (n == 0) {
            return Ackermann(m - 1, 1);
        } else {
            return Ackermann(m - 1, Ackermann(m, n - 1));
        }
    }

    public static void main(String[] args) {
        System.out.println(Ackermann(2, 1));
    }
}
