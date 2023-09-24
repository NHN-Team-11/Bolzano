package Chapter7.Minseook.Exercise;

import java.util.Arrays;

public class Practice7 {
    public static int[] removeDuplicates(int[] A) {
        int[] arr = new int[A.length];
        int count = 0;
        Arrays.sort(A);
        A[count] = arr[count];
        count = 1;
        for (int i = 1; i < A.length; i++) {
            if (A[i] == A[i - 1]) {
                continue;
            }
            arr[count] = A[i];
            count++;
        }
        int[] result = new int[count];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] Arr = { 1, 2, 2, 2, 2, 2, 3, 3, 3, 4, 5, 6, 7, 8 };
        int[] result = removeDuplicates(Arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

}
