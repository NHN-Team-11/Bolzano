
public class SideEffect1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("테스트");
        StringBuffer t;
        t = sb;
        sb.append("!");
        System.out.println(sb.toString());
        System.out.println(t.toString());
    }
}