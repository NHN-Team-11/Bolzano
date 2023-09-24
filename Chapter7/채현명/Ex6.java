package Chapter7.채현명;

public class Ex6 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4 };

        int distinctDuplicates = numberOfDuplicates(array);
        int distinctValues = numberOfDistinctValues(array);

        System.out.println("중복 값 수 : " + distinctDuplicates);
        System.out.println("다른 값 수 : " + distinctValues);
    }

    public static int numberOfDuplicates(int[] A) {
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] == A[j]) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }

    public static int numberOfDistinctValues(int[] A) {
        int count = 0;
        boolean[] counted = new boolean[A.length];

        for (int i = 0; i < A.length; i++) {
            if (!counted[i]) {
                count++;
                counted[i] = true;

                for (int j = i + 1; j < A.length; j++) {
                    if (A[i] == A[j]) {
                        counted[j] = true;
                    }
                }
            }
        }

        return count;
    }
}
