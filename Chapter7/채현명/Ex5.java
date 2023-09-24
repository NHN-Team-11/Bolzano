package Chapter7.채현명;

public class Ex5 {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 1, 2, 3, 4, 5 };
        int[] array3 = { 1, 2, 3, 4, 6 };

        System.out.println("arrays 1, array 2 비교: " + equalArrays(array1, array2));
        System.out.println("arrays 1, array 3 비교: " + equalArrays(array1, array3));
    }

    public static boolean equalArrays(int[] A, int[] B) {
        if (A.length != B.length) {
            return false;
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] != B[i]) {
                return false;
            }
        }

        return true;
    }
}
