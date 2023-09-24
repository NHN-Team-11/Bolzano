package Chapter7.Minseook.Exercise;

public class Practice5 {
    static boolean equalArrays(int[] A, int[] B) {
        if (A.length != B.length) {
            throw new IllegalArgumentException("크기부터 다르ㅂ니다.");
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] != B[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5 };
        int[] B = { 1, 2, 3, 4, 5 };

        System.out.println(equalArrays(A, B));
    }

}
