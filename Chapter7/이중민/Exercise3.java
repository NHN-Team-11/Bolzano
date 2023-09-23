package Chapter7.이중민;

public class Exercise3 {
    public static double[][] transposeMatrix(double[][] M) {
        double[][] result = new double[M[0].length][M.length];
        for (int i = 0; i < M[0].length; i++) {
            for (int j = 0; j < M.length; j++) {
                result[i][j] = M[j][i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        double[][] matrix = {
            {2, 3}, 
            {5, 0}, 
           {1, 1}};
        double[][] result = transposeMatrix(matrix);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}
