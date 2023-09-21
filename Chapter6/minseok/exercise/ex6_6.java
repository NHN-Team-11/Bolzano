package Chapter6.minseok.exercise;

public class ex6_6 {
    public static String decode(String a, int d) {
        String resText = "";
        char c;
        int ci;
        for (int i = 0; i < a.length(); i++) {
            c = a.charAt(i);
            ci = (int) c;
            ci = ci - d;
            c = (char) ci;
            resText = resText + String.valueOf(c);
        }
        return resText;
    }

}
