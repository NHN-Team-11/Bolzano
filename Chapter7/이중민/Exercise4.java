package Chapter7.이중민;

public class Exercise4 {
    public static int[] matrixSumColumn(int[][] matrix) {
        int[] result = new int[matrix[0].length];
        int sum = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[j][i];
            }
            result[i] = sum;
            sum = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {2, 3},
            {4, 5},
            {6, 7}
        };

        int[] result = matrixSumColumn(matrix);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    
}
