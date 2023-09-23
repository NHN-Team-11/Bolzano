package Chapter7.이중민;


/**
 * 이 코드는 배열의 홀수의 개수를 알아내는 메소드이다.
 */
public class Exercise8 {
    public static int mystery(int[] A) {
        int x = 0;
        for (int i = 0; i < A.length; i++)
        if (A[i] % 2 == 1) x++;
        return x;
        }
}
