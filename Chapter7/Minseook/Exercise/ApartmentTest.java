package Chapter7.Minseook.Exercise;

public class ApartmentTest {
    public static void main(String[] args) {
        Apartment apt = new Apartment(10, "광주 북구 풍향동");
        apt.newPerson("하재준");
        apt.newPerson("김민석");
        apt.newPerson("하재준");
        apt.newPerson("김윤호");
        apt.newPerson("김윤호");
        apt.newPerson("이중민");
        apt.newPerson("채현명");
        apt.newPerson("변정훈");

        System.out.println(apt);
        System.out.println(apt.getRoomNumber());
        apt.removePerson(3);
        System.out.println(apt);
        System.out.println(apt.getPerson(1));
        System.out.println(apt.getPerson(6));
    }

}
