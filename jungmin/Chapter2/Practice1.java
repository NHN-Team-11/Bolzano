package Chapter2;

public class Practice1 {
    public static void main(String[] args) {
        String name = new String("Lee");
        String first = name.substring(0, 1);
        String last = name.substring(name.length() - 1, name.length());
        System.out.println(first);
        System.out.println(last);
    }
}
