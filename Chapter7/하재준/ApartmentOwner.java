public class ApartmentOwner {
    private String owner;
    private String[] apartments;

    public ApartmentOwner(String owner) {
        this.owner = owner;
        apartments = new String[10];
    }

    public String getOwner() {
        return owner;
    }

    public String getApartment(int slot) {
        return apartments[slot];
    }

    public void setApartment(String address, int slot) {
        apartments[slot] = address;
    }

    public int countApartments() {
        int count = 0;
        for (int i = 0; i < apartments.length; i++) {
            if (apartments[i] != null) {
                count++;
            }
        }
        return count;
    }

    public void reorganizeApartments() {
        int empty = -1;
        for (int i = 0; i < 10; i++) {
            if (apartments[i] == null && empty == -1)
                empty = i;
            if (apartments[i] != null && empty != -1) {
                apartments[empty] = apartments[i];
                apartments[i] = null;
                empty++;
            }
        }
    }

    public String toString() {
        String ris = "";
        ris += "Owner: " + owner;
        for (int i = 0; i < 10; i++)
            if (apartments[i] != null)
                ris += "\nApartment " + i + ": " + apartments[i];
        return ris;
    }

    public static void main(String[] args) {
        ApartmentOwner p = new ApartmentOwner("Mario Rossi");
        p.setApartment("Via della Camilluccia, 29", 0);
        p.setApartment("Largo di Torre Argentina, 42", 1);
        p.setApartment("P.zza Conca D’Oro, 9", 2);
        p.setApartment("Via del Corso, 30", 5);
        p.setApartment("Via Trionfale, 2500", 8);
        System.out.println(p);
        System.out.println();
        System.out.println(p.getOwner() + " has " +
                p.countApartments() + " apartments");
        System.out.println("Apartment 2: " + p.getApartment(2));
        System.out.println();
        p.reorganizeApartments();
        System.out.println(p);
    }

}
