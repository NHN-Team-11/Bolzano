import javax.swing.JOptionPane;

public class Practice1 {
    public static void main(String[] args) {
        String name = new String("Lee");
        String first = name.substring(0, 1);
        String last = name.substring(name.length() - 1, name.length());
        String a = "Lee";
        String b = "Lee";
        a.concat(last)
        System.out.println(a == b);
        System.out.println(name == a);
        System.out.println(first);
        System.out.println(last);
    }
}
