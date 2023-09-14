public class Parameters {
    public static String changeValueS(String s) {
        return s + "*";
    }

    public static void changeValueSB(StringBuffer sb) {
        sb.append("*");
    }

    public static void main(String[] args) {
        String a = "Hello";
        StringBuffer b = new StringBuffer("Ciao");

        System.out.println("String a = " + a);
        System.out.println("StringBuffer b = " + b);

        changeValueS(a);
        changeValueSB(b);
        System.out.println(changeValueS(a));
        System.out.println(b);

    }
}
