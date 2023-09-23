package Chapter7.이중민;

public class Exercise11 {
    public static boolean diagonal(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                if(i != j && M[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] test = {
            {1, 0, 0, 0},
            {0, 3, 0, 0},
            {0, 0, 6, 0},
            {0, 0, 0, 5}
        };
        System.out.println(diagonal(test));
    }
}
