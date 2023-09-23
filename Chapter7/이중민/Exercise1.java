package Chapter7.이중민;

public class Exercise1 {
    public static double scalarProduct(double[] A, double[] B) {
        double result = 0;
        for (int i = 0; i < A.length; i++) {
            result += (A[i] * B[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        double[] a = {1.0, 2.0};
        double[] b = {3.0, 5.5};
        System.out.println(scalarProduct(a, b));
    }
}
