
public class Hamburger {
    public static void main(String[] args) {
        String s, t, u, v, z;
        s = "ham";
        t = "burger";
        u = s.concat(t);
        v = u.substring(0, 3);
        z = u.substring(3);
        System.out.println("s = ".concat(s));
        System.out.println("t = ".concat(t));
        System.out.println("u = ".concat(u));
        System.out.println("v = ".concat(v));
        System.out.println("z = ".concat(z));

        String x = "xxx", y = "yyy", a = "zzz";
        String temp = x.concat(y);
        String result = temp.concat(a);
        System.out.println(result);
    }

}
