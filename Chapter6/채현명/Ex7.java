package Chapter6.채현명;

public class Ex7 {
    public static void main(String[] args) {
        System.out.println(returnlength("ccac"));
    }

    private static int returnlength(String string) {
        char bit;
        int cont = 0;
        int maxlen = 0;

        for (int i = 0; i < string.length(); i++) {
            boolean isNotHaveWord = string.charAt(i) != 'c';

            if (isNotHaveWord) {
                return -1;
            }

            bit = string.charAt(i);

            if (bit == 'c') {
                cont++;
                if (cont > maxlen)
                    maxlen = cont;
            } else
                cont = 0;

        }
        return string.indexOf(maxlen - 1);
    }
}
