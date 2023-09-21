package Chapter6.jungmin;

public class Practice6 {
    public static String decode(String text, int key) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            result += (char)(text.charAt(i) - key);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(decode("Hello", 1));
    }
}
