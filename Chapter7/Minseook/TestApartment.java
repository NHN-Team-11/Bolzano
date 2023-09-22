package Chapter7.Minseook;

public class TestApartment {
    public static void main(String[] args) {
        Apartment p = new Apartment("Mario Rossi");
        p.setApartment("Via della Camilluccia, 29", 0);
        p.setApartment("Largo di Torre Argentina, 42", 1);
        p.setApartment("P.zza Conca D'Oro, 9", 2);
        p.setApartment("Via del Corso, 30", 5);
        p.setApartment("Via Trionfale, 2500", 8);
        System.out.println(p);

        System.out.println();
        System.out.println(p.getOwnerName() + " has " +
                p.countApartments() + " apartments");
        System.out.println("Apartment 2: " + p.getApartments(2));

        System.out.println();
        p.reorganizeApartments();
        System.out.println(p);
    }

}
