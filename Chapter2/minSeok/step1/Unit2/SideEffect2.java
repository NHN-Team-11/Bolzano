
public class SideEffect2 {
    public static void main(String[] args) {
        String s = "name surname";
        StringBuffer sb = new StringBuffer(s);
        sb.replace(0, 1, sb.substring(0, 1));
        sb.replace(5, 6, sb.substring(5, 6));
        System.out.println(sb.toString());
    }

}
