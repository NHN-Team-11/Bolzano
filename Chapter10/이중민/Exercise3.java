package Chapter10.이중민;

public class Exercise3 {
    public static int ackermann(int m, int n) {
        if(m == 0) {
            return n+1;
        }
        if(n == 0) {
            return ackermann(m-1, 1);
        }
        return ackermann(m - 1, ackermann(m, n-1));
    }

    public static void main(String[] args) {
        System.out.println(ackermann(1, 2));
    }
}
