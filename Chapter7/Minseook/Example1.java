package Chapter7.Minseook;

public class Example1 {

    public static int sumArrayValues(int[] v) {
        int sum = 0;
        for (int i = 0; i < v.length; i++) {
            sum += v[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] x = new int[100];

        for (int i = 0; i < x.length; i++) {
            x[i] = 2 * i;
        }
        System.out.println(sumArrayValues(x));
    }

}
