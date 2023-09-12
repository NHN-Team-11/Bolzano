public class SideEffect2 {
    public static void main(String[] args) {
        String s = "name surname";
        StringBuffer sbuf = new StringBuffer(s);
        sbuf.replace(0,1,s.substring(0, 1).toUpperCase());
        sbuf.replace(5, 6, s.substring(5, 6).toUpperCase());
        System.out.println(sbuf.toString());
    }
}
