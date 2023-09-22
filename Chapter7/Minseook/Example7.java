package Chapter7.Minseook;

public class Example7 {
    public static double[][] matrixProduct(double[][] A, double[][] B) {
        double[][] C = new double[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                C[i][j] = 0;
                for (int k = 0; k < A[0].length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }

    public static void main(String[] args) {
        double[][] A = {
                { 1.0, 2.0, 2.0 },
                { 7.0, 5.0, 9.0 },
                { 3.0, 0.0, 6.0 }
        };

        double[][] B = {
                { 5.0, 4.0, 7.0 },
                { 1.0, 0.0, 3.0 },
                { 7.0, 5.0, 2.0 }
        };

        double[][] C = matrixProduct(A, B);
        System.out.println(C[1][0]);
    }

}
