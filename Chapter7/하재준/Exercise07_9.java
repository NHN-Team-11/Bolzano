public class Exercise07_9 {
    static boolean symmetric(int[][] M) {

        if (M.length != M[0].length) {
            return false;
        }
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                if (M[i][j] != M[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] M = {
                { 2, 4, 3 },
                { 4, 3, 4 },
                { 3, 4, 3 }
        };
        System.out.println(symmetric(M));
    }
}
