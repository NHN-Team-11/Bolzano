public class SideEffect1 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("test");
        StringBuffer t;
        t = s;
        s.append("!");
        s.insert(2,"a");
        System.out.println(s.toString());
        System.out.println(t.toString());

    }
}
