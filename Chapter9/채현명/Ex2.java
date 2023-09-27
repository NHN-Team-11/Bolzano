package Chapter9.채현명;

public class Ex2 {

    /*
     * runtime error나 compile error가 발생하지 않음 출력값 = 101
     */

    private int x = 101;

    private void f(int x) {
        x++;
        g();
    }

    private void g() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Ex2 e = new Ex2();
        int x = 200;
        e.f(x);
    }
}