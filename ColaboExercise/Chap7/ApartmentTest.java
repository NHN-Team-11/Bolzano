package ColaboExercise.Chap7;

public class ApartmentTest {
    public static void main(String[] args) {
        Apartment apartment = new Apartment(100, "429-8 번지");

        System.out.println(apartment.getAddress());
        System.out.println(apartment.getSize());
        apartment.setApartment("이중민");
        apartment.setApartment("김윤호");
        apartment.setApartment("채현명");
        apartment.setApartment("하재준");
        System.out.println(apartment.getNumberOfPerson());
        System.out.println(apartment.getOwnerName(0));
        apartment.outOwner(0);
        System.out.println(apartment.getOwnerName(0));
        apartment.setApartment("김민석");
        System.out.println(apartment.getNumberOfPerson());
        System.out.println(apartment.toString());
    }
}
