public class Exercise07_3 {
    static double[][] transposeMatrix(double[][] M) {
        double[][] result = new double[M[0].length][M.length];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                result[j][i] = M[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        double[][] M = {
                { 10, 12, 11 },
                { 9, 7, 4 }
        };
        double[][] T = transposeMatrix(M);
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[0].length; j++) {
                System.out.print(T[i][j] + " ");
            }
            System.out.println();
        }
    }
}
