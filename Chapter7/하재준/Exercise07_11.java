public class Exercise07_11 {
    static boolean diagonal(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                if (i != j) {
                    if (M[i][j] != 0) {
                        return false;
                    }
                }
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int[][] Matrix = {
                { 3, 0, 0 },
                { 0, 8, 0 },
                { 0, 0, 4 }
        };
        System.out.println(diagonal(Matrix));
    }
}