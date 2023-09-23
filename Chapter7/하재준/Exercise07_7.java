import java.util.Arrays;

public class Exercise07_7 {
    static int[] removeDuplicates(int[] A) {
        int[] temp = new int[A.length];
        int index = 0;
        Arrays.sort(A);
        temp[index] = A[index];
        index = 1;
        for (int i = 1; i < A.length; i++) {
            if (A[i] == A[i - 1]) {
                continue;
            }
            temp[index] = A[i];
            index++;
        }
        int[] result = new int[index];
        for (int i = 0; i < result.length; i++) {
            result[i] = temp[i];
        }
        return result;

    }

    public static void main(String[] args) {
        int[] A = { 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5 };
        int[] result = removeDuplicates(A);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

}
