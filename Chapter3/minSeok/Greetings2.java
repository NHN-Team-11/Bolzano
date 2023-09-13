package Unit3;

public class Greetings2 {
    public static void printGreeting() {
        System.out.println("Hello");
    }

    public static void printGreeting(String name) {
        System.out.println("Hello " + name + "!");
    }

    public static void main(String[] args) {
        // String a = "Hello";
        // String b = "Hello";
        // String s = a.substring(0, 1);
        // String t = b.substring(0, 1);

        // System.out.println(s == t);
        printGreeting();
        printGreeting("minseok");
    }

}
