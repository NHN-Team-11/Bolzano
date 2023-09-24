package Chapter7.채현명;

public class Ex11 {
    public static void main(String[] args) {
        int[][] diagonalMatrix = {
                { 1, 0, 0 },
                { 0, 2, 0 },
                { 0, 0, 3 }
        };

        System.out.println(diagonal(diagonalMatrix));
    }

    public static boolean diagonal(int[][] M) {
        int numRows = M.length;
        int numCols = M[0].length;

        if (numRows != numCols) {
            return false;
        }

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (i != j && M[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }
}
