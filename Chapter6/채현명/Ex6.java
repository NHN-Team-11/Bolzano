package Chapter6.채현명;

public class Ex6 {

    public static void main(String[] args) {
        decode("BC", 1);
    }

    private static void decode(String string, int number) {
        String result = "";

        for (int i = 0; i < string.length(); i++) {
            result += (char) (string.charAt(i) - number);
        }
        System.out.println(result);
    }

}
