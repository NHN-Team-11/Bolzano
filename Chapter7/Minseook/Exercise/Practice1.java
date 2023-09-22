package Chapter7.Minseook.Exercise;

public class Practice1 {
    public static double scalarProduct(double[] A, double[] B) {
        if (A.length != B.length) {
            throw new IllegalArgumentException("A와 B의 사이즈는 같아야 합니다!");
        }

        double sum = 0;
        double scalar = 1;
        for (int i = 0; i < A.length; i++) {
            scalar = A[i] * B[i];
            sum += scalar;
        }
        return sum;
    }

    public static void main(String[] args) {
        double[] A = { 1.0, 2.0, 3.0, 4.0 };
        double[] B = { 1.0, 2.0, 3.0, 4.0 };

        System.out.println(scalarProduct(A, B));
    }
}