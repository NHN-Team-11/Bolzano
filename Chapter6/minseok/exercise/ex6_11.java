package Chapter6.minseok.exercise;

public class ex6_11 {
    public static boolean predicate(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(predicate(2));
    }

}
