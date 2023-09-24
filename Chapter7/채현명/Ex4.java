package Chapter7.채현명;

public class Ex4 {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[] column = sumOfColumn(matrix);

        for (int i = 0; i < column.length; i++) {
            System.out.println("컬럼의 합 " + i + ": " + column[i]);
        }
    }

    public static int[] sumOfColumn(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        int[] column = new int[numCols];

        for (int j = 0; j < numCols; j++) {
            int sum = 0;
            for (int i = 0; i < numRows; i++) {
                sum += matrix[i][j];
            }
            column[j] = sum;
        }

        return column;
    }
}
