package Chapter7.Minseook.Exercise;

public class Practice2 {

    public static int[] interSection(int[] A, int[] B) {
        if (A == null && B == null) {
            throw new IllegalArgumentException("A, B 둘 다 원소값을 가져야 합니다.");
        }

        int count = 0;
        int num = 0;

        for (int aindex = 0; aindex < A.length; aindex++) {
            for (int bindex = 0; bindex < B.length; bindex++) {
                if (A[aindex] == B[bindex]) {
                    count++;
                }
            }
        }
        int[] C = new int[count];
        for (int aindex = 0; aindex < A.length; aindex++) {
            for (int bindex = 0; bindex < B.length; bindex++) {
                if (A[aindex] == B[bindex]) {
                    C[num++] = A[aindex];
                }
            }
        }
        return C;

    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 5, 7 };
        int[] B = { 1, 4, 6, 9 };

        int[] C = interSection(A, B);

        for (int cIndex = 0; cIndex < C.length; cIndex++) {
            System.out.println(C[cIndex] + " ");
        }
    }

}
