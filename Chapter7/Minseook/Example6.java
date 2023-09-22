package Chapter7.Minseook;

public class Example6 {

    public static double[][] matrixSum(double[][] A, double[][] B) {
        double[][] C = new double[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    public static void main(String[] args) {
        double[][] A = {
                { 1.2, 2.3, 2.3 },
                { 7.4, 5.1, 9.8 }
        };

        double[][] B = {
                { 5.0, 4.0, 2.3 },
                { 1.2, 0.3, 3.2 }
        };

        double[][] C = matrixSum(A, B);
        System.out.println(C[1][0]);
    }

}
