package Chapter3.채현명;

public class Person {
    // 데이터 필드 == 인스턴스 변수
    private String name;
    private String residence;

    // method (실제로 기능이 작동? 실행되는 필드)

    public Person(String n, String r) {
        name = n;
        residence = r;
    }

    public Person() {
        name = "John Smith";
        residence = null;
    }

    public String getName() {
        return this.name;
    }

    public String getResidence() {
        return this.residence;
    }

    public void setResidence(String newResidence) {
        residence = newResidence;
    }
}
