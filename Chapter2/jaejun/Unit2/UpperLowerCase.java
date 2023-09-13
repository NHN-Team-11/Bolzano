public class UpperLowerCase {
    public static void main(String[] args) {
        String s, upper, lower;
        s = new String("Hello");
        upper = s.toUpperCase();
        lower = s.toLowerCase();
        System.out.println(s);
        System.out.print("upper = ");
        System.out.println(upper);
        System.out.print("lower = ");
        System.out.println(lower);
    }
}
