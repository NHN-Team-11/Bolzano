public class Exercise07_2 {
    static int[] intersection(int[] A, int[] B) {
        int[] temp = new int[A.length];
        int index = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    temp[index] = A[i];
                    index++;
                }
            }
        }

        int[] result = new int[index];
        for (int i = 0; i < result.length; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5 };
        int[] B = { 3, 4, 5, 6, 7 };

        int[] C = intersection(A, B);
        for (int i = 0; i < C.length; i++) {
            System.out.println(C[i]);
        }
    }
}
