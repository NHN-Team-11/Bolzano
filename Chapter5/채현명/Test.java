package Chapter5.채현명;

public class Test {
    public static void main(String[] args) {
        String s = new String("pippo");
        String t = new String("pippo");
        String w = s;
        System.out.println("s == w? " + (s == w));
        System.out.println("s == t? " + (s == t));
        System.out.println("s equals t?" + s.equals(t));
    }
}
