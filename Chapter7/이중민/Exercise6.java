package Chapter7.이중민;

import java.util.Arrays;

public class Exercise6 {
    public static int numberOfDuplicates(int[] A) {
        int duplicatesCount = 0;
        int result = -1;

        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if(result == A[i]) {
                    continue;
                }
                if(A[i] == A[j]) {
                    result = A[i];
                    duplicatesCount++;
                }
            }
        }
        return duplicatesCount;
    }

    public static int numberOfDistinctValues(int[] A) {
        Arrays.sort(A);
        int distinctCount = 1;
        for (int i = 0; i < A.length - 1; i++) {
            if(A[i] != A[i + 1]) {
                distinctCount++;
            }
        }
        return distinctCount;
    }

    public static void main(String[] args) {
        int[] numbers = {7, 1, 2, 2, 4, 5, 5, 5, 5, 6, 6};
        System.out.println(numberOfDuplicates(numbers));
        System.out.println(numberOfDistinctValues(numbers));
    }
}
