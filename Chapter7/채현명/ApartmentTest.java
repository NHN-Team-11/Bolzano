package Chapter7.채현명;

public class ApartmentTest {
    public static void main(String[] args) {
        Apartment apartment = new Apartment(6, "월산로 242");

        apartment.addResident("채현명");
        apartment.addResident("하제준");
        apartment.addResident("김민석");
        apartment.addResident("이중민");
        apartment.addResident("김윤호");
        apartment.addResident("변정훈");

        System.out.println(apartment.toString());

        System.out.println("거주민 1 :" + apartment.getResidentName(1));
        System.out.println("거주민 3 :" + apartment.getResidentName(3));
        System.out.println();

        System.out.println("제거 거주민: 1 ");
        apartment.removeResident(1);

        System.out.println("제거 후:");
        System.out.println(apartment.toString());
    }
}
