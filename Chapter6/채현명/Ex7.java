package Chapter6.채현명;

public class Ex7 {
    public static void main(String[] args) {
        System.out.println(returnlength("ccacccc", 'c'));
    }

    private static int returnlength(String string, char ch) {
        char bit;
        int cont = 0;
        int maxlen = 0;
        int position = 0;

        for (int i = 0; i < string.length(); i++) {

            bit = string.charAt(i);

            if (bit == ch) {
                cont++;
                if (cont > maxlen) {
                    maxlen = cont;
                    position = i - maxlen + 1;
                }
            } else
                cont = 0;
        }
        if (maxlen == 0) {
            return -1;
        }
        return position;
    }
}
