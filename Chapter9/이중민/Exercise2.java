package Chapter9.이중민;

public class Exercise2 {
    private int x = 101;
    private void f(int x) {
        x++;
        g();
    }
    private void g() {
        System.out.println(x);
    }
    public static void main(String[] args) {
        Exercise2 e = new Exercise2();
        int x = 200;
        e.f(x);
    }
}
