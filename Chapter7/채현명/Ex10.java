package Chapter7.채현명;

public class Ex10 {
    public static void main(String[] args) {
        int[][] lowerTriangularMatrix = {
                { 1, 0, 0 },
                { 2, 3, 0 },
                { 4, 5, 6 }
        };

        System.out.println(lowerTriangular(lowerTriangularMatrix));
    }

    public static boolean lowerTriangular(int[][] M) {
        int numRows = M.length;
        int numCols = M[0].length;

        if (numRows != numCols) {
            return false;
        }

        for (int i = 0; i < numRows; i++) {
            for (int j = i + 1; j < numCols; j++) {
                if (M[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }
}
