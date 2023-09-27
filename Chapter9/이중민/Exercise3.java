package Chapter9.이중민;

public class Exercise3 {
    public static void main(String[] args) {
        Base b = new Base();
        Derived d = new Derived();
        System.out.println(b.getInfo());
        System.out.println(d.getInfo());
        b = d;
        System.out.println(b.getInfo());
    }
}
