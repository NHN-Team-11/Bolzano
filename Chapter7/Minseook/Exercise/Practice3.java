package Chapter7.Minseook.Exercise;

public class Practice3 {
    public static double[][] transposeMatrix(double[][] M) {

        double[][] A = new double[M[0].length][M.length];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                A[j][i] = M[i][j];
            }
        }
        return A;

    }

    public static void main(String[] args) {
        double[][] A = {
                { 1.0, 2.0, 3.0 },
                { 4.0, 5.0, 6.0 }
        };

        double[][] B = transposeMatrix(A);

        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
    }
}