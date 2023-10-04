public class Exercise2 {

    private int x = 101;

    private void f(int x) {
        x++;
        g(x);
    }

    private void g(int x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Exercise2 e = new Exercise2();
        int x = 200;
        e.f(x);
    }
}
