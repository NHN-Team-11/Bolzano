package Chapter3.채현명;

public class Person2 {
    // instance 변수(데이터 필드)
    private String name;
    public String residence;

    public String getName() {
        return this.name;
    }

    public String getResidence() {
        return this.residence;
    }

    public void setResidence(String newResidence) {
        this.residence = newResidence;
    }

}

class Client2Person {
    public static void main(String[] args) {
        Person2 p1;
        p1 = new Person2();
        p1.setResidence("ROma");
        System.out.println(p1.getResidence());
        System.out.println(p1.residence);
    }
}
