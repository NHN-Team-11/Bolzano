public class Exercise07_1 {
    static double scalarProduct(double[] A, double[] B) {
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            result += A[i] * B[i];
        }
        return result;
    }

    public static void main(String[] args) {
        double[] A = { 1.0, 2.0 };
        double[] B = { 4.0, 3.0 };
        System.out.println(scalarProduct(A, B));
    }

}
