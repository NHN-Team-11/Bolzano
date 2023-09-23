public class Exercise07_5 {
    static boolean equalArrays(int[] A, int[] B) {
        if (A.length != B.length) {
            throw new IllegalArgumentException("크기부터 다르잖아!!");
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] != B[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] A = { 2, 5, 6, 5, 4, 3 };
        int[] B = { 2, 5, 6, 5, 4, 3 };
        System.out.println(equalArrays(A, B));
    }
}
