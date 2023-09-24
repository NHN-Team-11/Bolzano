package Chapter7.Minseook.Exercise;

public class Practice9 {

    public static boolean symmetric(int[][] M) {
        if (M.length != M[0].length) {
            return false;
        }

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                if (M[i][j] == M[j][i]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 2, 4, 3 },
                { 4, 3, 4 },
                { 3, 4, 3 }
        };
        System.out.println(symmetric(arr));
    }
}
