package Chapter9.채현명;

public class Ex1 {
    // compile error : for문 내 올바르지 않은 문법 사용
    // run
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        for (i = 0, j = 0; i < 10 && j < 10; i++, j++) {
            System.out.println(i + " + " + j + " = " + (i + j));
        }
        System.out.println("I’ve printed out the sums of i and j up to " + i + "," + j);

    }
}