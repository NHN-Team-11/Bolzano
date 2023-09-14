
public class Visibility {
    public static String duplicate(String s) {
        String t = s + ", " + s;
        return t;
    }

    // public static void print1() {
    // System.out.println(a); // Error : a is not defined
    // }

    // public static void print2() {
    // System.out.println(t); // Error : t is not defined
    // }

    public static void main(String[] args) {
        String a = "Ciao";
        a = duplicate(a);
        // print1();
        // print2();
        System.out.println(a);
    }

}
