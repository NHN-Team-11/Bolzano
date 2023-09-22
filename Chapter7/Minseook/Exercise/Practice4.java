package Chapter7.Minseook.Exercise;

public class Practice4 {
    public static int[] matrixSumColumns(int[][] M) {
        int[] SumCol = new int[M[0].length];
        for (int col = 0; col < M[0].length; col++) {
            SumCol[col] = 0;
            for (int row = 0; row < M.length; row++)
                SumCol[col] += M[row][col];
        }
        return SumCol;
    }

    public static void main(String[] args) {
        int[][] A = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[] B = matrixSumColumns(A);
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();
    }

}
