package Chapter7.이중민;

import java.util.Arrays;

public class Exercise7 {
    public static int[] removeDuplicates(int[] A) {
        int count = 1;

        Arrays.sort(A);
        for (int i = 0; i < A.length - 1; i++) {
            if(A[i] != A[i + 1]) {
                count++;
            }
        }

        int[] result = new int[count];
        result[0] = A[0];
        int index = count - 1;
        for (int i = A.length-1; i >= 1; i--) {
            if(A[i] == A[i - 1]) {
                continue;
            }
            result[index--] = A[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 5, 2, 4, 3, 10, 4, 6}; 
        int[] result = removeDuplicates(numbers);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
