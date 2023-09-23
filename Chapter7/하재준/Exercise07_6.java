import java.util.Arrays;

public class Exercise07_6 {
    static int numberOfDuplicates(int[] A) {
        Arrays.sort(A);
        int count = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == A[i + 1]) {
                count++;
            }
            continue;
        }
        return count;
    }

    static int numberofDistinctValues(int[] A) {
        int count = A.length - numberOfDuplicates(A);
        return count;
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 2, 3, 4, 5, 6, 6, 7, 77, 8 };
        System.out.println(numberOfDuplicates(A));
        System.out.println(numberofDistinctValues(A));
    }
}
