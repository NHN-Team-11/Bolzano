package Chapter3.채현명;

public class ClientClassPerson {
    public static void main(String[] args) {
        Person p1; // Person이라는 타입의 p1을 선언(declare)
        p1 = new Person(); // p1에 new person을 정의(definition) 즉 p1은 지금 값이 초기화가 된것임, 그렇기에 p1이 객체가 되었다. 즉
                           // Person이라는 클래스의 인스턴스화가 되었다.
        p1.setResidence("Roma");
        System.out.println(p1.getResidence());
        // System.out.println(p1.residence); // field 값 residencesms private형 그렇기에 호출이
        // 불가능함.
    }

}
