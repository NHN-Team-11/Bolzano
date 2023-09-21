package Chapter6.minseok.exercise;

public class ex6_7 {
    public static int longSequence(String s, char c) {
        int count = 0;
        int max = 0;
        int pos = -1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
                if (count > max) {
                    max = count;
                    pos = i - count + 1;
                }
            } else {
                count = 0;
            }
        }

        return pos;
    }

    public static void main(String[] args) {
        System.out.println(longSequence("kimminseok", 'm'));
    }
}