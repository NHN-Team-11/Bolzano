public class Exercise07_10 {
    static boolean lowerTriangular(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                if (i < j) {
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
                { 7, 8, 0 },
                { 0, 5, 0 }
        };
        System.out.println(lowerTriangular(Matrix));
    }
}
