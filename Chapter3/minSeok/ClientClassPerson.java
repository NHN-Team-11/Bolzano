package Unit3;

public class ClientClassPerson {
    public static void main(String[] args) {
        Person p1;
        p1 = new Person();
        p1.setResidence("Roma");
        System.out.println(p1.getResidence());

        // Person type의 main local variables로 define
        // Person class의 new object를 생성하고 이를 p1에 참조
        // p1에 표시된 object에 대해 Person class의 setResidence의 메소드를 호출하고 actual parameters
        // "Roma"를 메소드에 passing
        // p1에서 getResidence 메소드를 호출하여 p1으로 표시된 object의 residence를 print

    }

}
