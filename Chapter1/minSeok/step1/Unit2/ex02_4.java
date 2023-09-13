
public class ex02_4 {
    public static void main(String[] args) {
        String s = "김민석";
        StringBuffer sb = new StringBuffer(s);
        sb.replace(0, 1, s.substring(2, 3));
        sb.replace(2, 3, s.substring(0, 1));
        System.out.println(s.substring(2, 3) + s.substring(1, 2) + s.substring(0, 1));
        System.out.println(sb.toString());

    }
}
