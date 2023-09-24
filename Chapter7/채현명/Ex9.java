package Chapter7.채현명;

public class Ex9 {
    public static void main(String[] args) {
        int[][] symmetricMatrix = {
                { 1, 2, 3 },
                { 2, 4, 5 },
                { 3, 5, 6 }
        };

        int[][] noSymmetricMatrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println("대칭인가요? : " + symmetric(symmetricMatrix));
        System.out.println("대칭이 아닌가요? : " + symmetric(noSymmetricMatrix));
    }

    public static boolean symmetric(int[][] M) {
        int numRows = M.length;
        int numCols = M[0].length;

        if (numRows != numCols) {
            return false;
        }

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (M[i][j] != M[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }
}
