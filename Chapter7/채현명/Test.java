package Chapter7.채현명;

public class Test {
    // public static void printMatrixRows(short[][] m) {
    // for (int i = 0; i < m.length; i++) {
    // for (int j = 0; j < m[0].length; j++)
    // System.out.print(m[i][j] + " ");
    // System.out.println();
    // }
    // }

    // public static void printMatrixColumns(short[][] m) {
    // for (int j = 0; j < m[0].length; j++) {
    // for (int i = 0; i < m.length; i++)
    // System.out.print(m[i][j] + " ");
    // System.out.println();
    // }

    public static double[][] matrixSum(double[][] A, double[][] B) {
        double[][] C = new double[A.length][B.length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < B.length; j++)
                C[i][j] = A[i][j] + B[i][j];
        return C;
    }

    public static void main(String[] args) {
        double[][] A = {
                { 1.2, 2.3, 2.3 },
                { 7.4, 5.1, 9.8 }
        };

        double[][] B = {
                { 5.0, 4.0, 1.3 },
                { 1.2, 0.3, 3.2 }
        };

        double[][] C = matrixSum(A, B);
        System.out.println(C[1][0]);
    }
}
