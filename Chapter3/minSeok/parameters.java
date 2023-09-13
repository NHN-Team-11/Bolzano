package Unit3;

public class parameters {
    public static String duplicate(String pf) {
        return pf + ", " + pf;
    }

    public static void changeValueS(String s) {
        s = s.concat("*");
    }

    public static void changeValueS(StringBuffer sb) {
        sb.append("*");
    }

    public static void main(String[] args) {
        // String s;
        // s = duplicate("pippo" + " & " + "topolino");

        // System.out.println(s);
        String a = "안녕하세요";
        StringBuffer b = new StringBuffer("Ciao");

        System.out.println("String a = " + a);
        System.out.println("StringBuffer b = " + b);

        changeValueS(a);
        changeValueS(b);

        System.out.println("String a = " + a);
        System.out.println("StringBuffer b = " + b);
    }

}
