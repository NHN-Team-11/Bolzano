package Chapter2;

public class Practice4 {
    public static void main(String[] args) {
        String name = "Lee jung min";
        String a = "";
        a = name.substring(name.length() -1, name.length()) + name.substring(1, name.length()-1) + name.substring(0,1);
        System.out.println(a);
    }
}
