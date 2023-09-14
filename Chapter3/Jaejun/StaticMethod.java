public class StaticMethod {

    public static void printGreeting() {
        System.out.println("Good morning!");
    }

    public static void printPersonalGreeting(String firstName,String lastName) {
        System.out.println("Good moring ");
        if(firstName.equals("하")) {
            return;
        }
        System.out.println(firstName);
        System.out.println(" ");
        System.out.println(lastName);
        System.out.println("!");
    }

    public static void printInformalGreeting(String name) {
        System.out.println("Ciao " + name + "!");
    }

    public static void main(String[] args) {
        // printGreeting();
        printPersonalGreeting("하", "재준");
        // printInformalGreeting("재준");
    }
}