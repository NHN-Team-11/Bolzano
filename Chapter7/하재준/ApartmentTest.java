public class ApartmentTest {
    public static void main(String[] args) {
        Apartment xii = new Apartment(10, "광주 동구 지산동 34");
        xii.newPerson("하재준");
        xii.newPerson("채현명");
        xii.newPerson("이중민");
        xii.newPerson("변정훈");
        xii.newPerson("변정훈");
        xii.newPerson("변정훈");
        xii.newPerson("유재석");
        xii.newPerson("김민석");
        xii.newPerson("김민석");
        xii.newPerson("강호동");
        xii.newPerson("태진아");

        System.out.println(xii);
        System.out.println(xii.getRoomNumber());
        xii.removePerson(3);
        System.out.println(xii);
        System.out.println(xii.getPerson(1));
        System.out.println(xii.getPerson(8));
        System.out.println(xii.getPerson(17));
    }
}
