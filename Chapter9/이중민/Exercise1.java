package Chapter9.이중민;


/**
 * syntax오류를 일으킵니다.
 * 두번 째 print문에서 i와 j의 값이 없기 때문에 runtime 에러가 일어납니다.
 */
public class Exercise1 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        for (i = 0,  j = 0; i < 10 && j < 10; i++, j++) {
        System.out.println(i + " + " + j + " = " + (i+j));
        }
        System.out.println("I’ve printed out the sums of i and j up to "
        + i + "," + j);
    }
        
}
