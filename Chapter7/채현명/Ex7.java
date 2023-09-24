package Chapter7.채현명;

public class Ex7 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 3, 4, 5 };

        int[] result = removeDuplicates(array);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] removeDuplicates(int[] A) {
        if (A == null || A.length == 0) {
            return new int[0];
        }

        int cout = 1;

        for (int i = 1; i < A.length; i++) {
            boolean origin = true;
            for (int j = 0; j < cout; j++) {
                if (A[i] == A[j]) {
                    origin = false;
                    break;
                }
            }
            if (origin) {
                A[cout] = A[i];
                cout++;
            }
        }

        int[] result = new int[cout];

        for (int i = 0; i < cout; i++) {
            result[i] = A[i];
        }

        return result;
    }
}
