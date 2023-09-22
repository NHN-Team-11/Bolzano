package Chapter7.Minseook;

public class Example3 {
    public static long maxArray(long[] v) {
        long max = v[0];
        for (int i = 0; i < v.length; i++) {
            if (v[i] > max) {
                max = v[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        long[] x = { 42, 97, 31, -25 };
        System.out.println(maxArray(x));
    }

}
