public class Practice6 {
    public static int longest(String line,char c) {
        if(line.charAt(0)==c) {
            return 1+longest(line.substring(1),c);
        }
        return 0;
    }
}
