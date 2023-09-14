package Chapter4.채현명;

public class Account8 {
    public int ball;

    public Account8(int x) {
        ball = x;
    }
}

class Exercise8 {
    public static void method(int a, Account8 b) {
        a *= 2;
        b.ball *= 2;
    }

    public static void main(String[] args) {
        int c = 100;
        Account8 r = new Account8(100);
        method(c, r);
        System.out.println(c + " " + r.ball);
    }
}
