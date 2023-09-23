package Chapter7.이중민;

public class Exercise10 {
    public static boolean lowerTriangular(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                if(i == j || i > j) {
                    continue;
                }
                if(M[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] test = {
            {1, 0, 0, 0},
            {2, 3, 0, 0},
            {4, 5, 6, 0},
            {4, 5, 6, 5}
        };
        System.out.println(lowerTriangular(test));
    }
}
