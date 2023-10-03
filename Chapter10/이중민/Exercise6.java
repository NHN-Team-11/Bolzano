package Chapter10.이중민;
/**
 * 재귀문으로 할 때 max를 static으로 나둬야 풀 수 있는 건지?
 */
public class Exercise6 {
    static int max = 0;

    public static int longestSequence(String s, char c) {
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c) {
                count++;
                if(max < count) {
                    max = count;
                    
                }
            }
            else {
                return longestSequence(s.substring(i + 1, s.length()), c);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(longestSequence("aaaaaabaaaaabbaaaa", 'a'));
    }
}
