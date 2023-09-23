package Chapter7.이중민;

public class Exercise2 {

    public static int[] intersection(int[] A, int[] B) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if(A[i] == B[j]) {
                    count++;
                }
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if(A[i] == B[j]) {
                    result[index++] = A[i];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 6, 3, 2};
        int [] result = intersection(a, b);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
