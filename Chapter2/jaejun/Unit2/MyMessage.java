public class MyMessage {
    public static void main(String[] args) {
        String str = "  Ja va가 좋 아 요   ";
        // str = str.concat("va");

        

        System.out.println(str.concat("va"));
        System.out.println(str.length());
        System.out.println(str.substring(0, 2));
        System.out.println(str.substring(2));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
    }
}