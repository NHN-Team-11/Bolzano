public class Exercise07_4 {
    static int[] matrixSumColumns(int[][] M) {
        int[] result = new int[M[0].length];
        for (int i = 0; i < M[0].length; i++) {
            for (int j = 0; j < M.length; j++) {
                result[i] += M[j][i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 5 },
                { 4, 3 },
                { 7, 8 }
        };

        int[] result = matrixSumColumns(matrix);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
