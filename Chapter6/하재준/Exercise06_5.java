public class Exercise06_5 {
    static double getpi(int n) {
        double result = 0;
        for (int i = 0; i < 10000; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (i % 4 == 3) {
                result -= n / (double) i;
            }
            if (i % 4 == 1) {
                result += n / (double) i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getpi(4));
    }

}
