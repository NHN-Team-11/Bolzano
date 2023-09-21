package Chapter6.채현명;

public class Ex5 {
    public static void main(String[] args) {
        double pi = 0;
        double numer = 1;
        double demo = 1;

        int num = 100000000;

        for (int i = 1; i <= num; i++) {
            pi = pi + (1 / numer) * demo;
            numer = numer + 2;
            demo = demo * -1;
        }
        System.out.println(4 * pi);
    }
}
