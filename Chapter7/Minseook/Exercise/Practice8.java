package Chapter7.Minseook.Exercise;

public class Practice8 {
    public static int mystery(int[] A) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }

}
