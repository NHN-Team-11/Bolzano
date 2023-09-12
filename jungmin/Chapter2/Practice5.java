package Chapter2;

public class Practice5 {
    public static void main(String[] args) {
        String name = "Lee jung min";
        StringBuffer result = new StringBuffer(name);
        result.replace(0, 1, name.substring(name.length() - 1, name.length()));
        result.replace(name.length() - 1, name.length(), name.substring(0, 1));
        System.out.println(result);
    }
}
