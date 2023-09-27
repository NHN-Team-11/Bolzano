import java.io.*;
import java.util.Scanner;

public class Person {
    private String name, surname;

    public Person(String n, String c) {
        name = n;
        surname = c;
    }

    public static Person read(Scanner sc) throws IOException {
        String s = sc.nextLine();
        if (s == null)
            return null;
        else {
            return new Person(s, sc.nextLine());
        }
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", surname=" + surname + "]";
    }

    public static void main(String[] args) throws IOException {
        Person p = new Person("jaejun", "Ha");
        System.out.println(p);
        Scanner sc = new Scanner(System.in);
        Person p2 = read(sc);
        System.out.println(p2);
    }

}
