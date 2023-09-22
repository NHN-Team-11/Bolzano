public class Exercise06_7 {
    static int getLongestIndex(String line, char c) {
        int index = 0;
        int cnt = 0;
        int max = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == c) {
                cnt++;
                if (max < cnt) {
                    max = cnt;
                    index = i;
                }
            } else {
                cnt = 0;
            }
        }
        if (max == 0) {
            return -1;
        }
        return index - max + 1;
    }

    public static void main(String[] args) {
        System.out.println(getLongestIndex("helccclccedcccc", 'c'));
        System.out.println(getLongestIndex("helcdddcclccedcccc", 'b'));
        System.out.println(getLongestIndex("hellohhhph", 'h'));
    }
}
