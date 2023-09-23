package Chapter7.이중민;

public class Exercise5 {
     public static boolean equalArrays(int[] A, int[] B) {

        if(A.length != B.length) {
            return false;
        }

        for (int i = 0; i < A.length; i++) {
            if(A[i] != B[i]){
                return false;
            }
        }
        return true;
     }

     public static void main(String[] args) {
        int[] a = {1, 2, 4};
        int[] b = {1, 2, 3};
        System.out.println(equalArrays(a, b));
     }
}
