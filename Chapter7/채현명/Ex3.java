package Chapter7.채현명;

public class Ex3 {
    public static void main(String[] args) {
        double[][] Matrix = {
                { 1.0, 2.0, 3.0 },
                { 4.0, 5.0, 6.0 },
                { 7.0, 8.0, 9.0 }
        };

        double[][] transposedMatrix = transposeMatrix(Matrix);

        printMatrix(transposedMatrix);
    }

    public static double[][] transposeMatrix(double[][] M) {
        int row = M.length;
        int column = M[0].length;

        double[][] transposed = new double[column][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transposed[j][i] = M[i][j];
            }
        }

        return transposed;
    }

    public static void printMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
