package Bolzano.Chapter6.jungmin;

public class Practice7 {
    public static int longestSequence(String s, char c) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        int position = -1;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c) {
                count++;
                if(max < count) {
                    max = count;
                    position = i - count + 1;
                }
            }
            else {
                count = 0;
            }
        }
        return position;
    }
    public static void main(String[] args) {
        System.out.println(longestSequence("Hellllolllo", 'l'));
    }
}
