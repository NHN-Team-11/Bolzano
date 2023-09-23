package Chapter7.이중민;

public class Exercise9 {
    public static boolean symmetric(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                if(M[i][j] != M[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] test = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };
        System.out.println(symmetric(test));
    }
}
