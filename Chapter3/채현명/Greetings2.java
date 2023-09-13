package Chapter3.채현명;

public class Greetings2 {
    public static void printGreeting() {
        System.out.println("without formal parameters"); // formal parameters는 없는 메소드
    }

    public static void printGreeting(String name) { // String type의 formal parameters, actual parameter name을 받아옴.
        System.out.println("Hello" + name + "!");
    }

    public static void main(String[] args) {
        printGreeting();
        printGreeting("Hyun Myeong");
    }

}
//