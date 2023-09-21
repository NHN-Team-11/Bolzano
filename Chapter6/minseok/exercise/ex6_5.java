package Chapter6.minseok.exercise;

public class ex6_5 {

    public static double pi(int n) {
        double pi = 0;
        for (int i = 0; i < n; i++) {
            double term = 1.0 / (2 * i + 1);
            if (i % 2 == 0) {
                pi += term;
            } else {
                pi -= term;
            }
        }
        return 4 * pi;
    }

    public static void main(String[] args) {
        System.out.println(ex6_5.pi(100));
    }

}
