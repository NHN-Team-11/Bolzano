package Chapter7.Minseook.Exercise;

import java.util.Arrays;

public class Practice6 {
    public static int numberOfDuplicates(int[] A) {
        int duplicatescount = 0;
        Arrays.sort(A);

        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == A[i + 1]) {
                duplicatescount++;
                continue;
            }
        }

        return duplicatescount;
    }

    public static int numberOfDistinctValues(int[] A) {
        Arrays.sort(A);
        int count = A.length - numberOfDuplicates(A);

        return count;
    }

    public static void main(String[] args) {
        int[] arrays = { 1, 2, 2, 3, 3, 3, 3, 4, 6, 7, 8 };
        System.out.println(numberOfDuplicates(arrays));
        System.out.println(numberOfDistinctValues(arrays));
    }

}
