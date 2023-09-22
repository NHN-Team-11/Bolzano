package Chapter7.Minseook;

public class Apartment {
    private String OwnerName;
    private String[] apartments;

    public Apartment(String owner) {
        this.OwnerName = owner;
        apartments = new String[10];
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public String getApartments(int slot) {
        return apartments[slot];

    }

    public void setApartment(String address, int slot) {
        apartments[slot] = address;

    }

    public int countApartments() {
        int num = 0;
        for (int i = 0; i < 10; i++) {
            if (apartments[i] != null) {
                num++;
            }
        }
        return num;

    }

    public void reorganizeApartments() {
        int empty = -1;
        for (int i = 0; i < 10; i++) {
            if (apartments[i] == null && empty == -1) {
                empty = i;
            }
            if (apartments[i] != null && empty != -1) {
                apartments[empty] = apartments[i];
                apartments[i] = null;
                empty++;
            }

        }

    }

    // public String toString() {

    // }

}
