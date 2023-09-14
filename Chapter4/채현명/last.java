package Chapter4.채현명;

public class last {
    public static char lastCharacter(String s) {
        return s.charAt(s.length() - 1);
    }

    public static void main(String[] args) {
        String str = "김윤호";
        System.out.println(lastCharacter(str));
    }
}
