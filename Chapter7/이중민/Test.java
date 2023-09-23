package Chapter7.이중민;

import java.util.Arrays;

public class Test {
    private String owner;
    private String[] apart;

    public Test(String name) {
        this.owner = name;
        this.apart = new String[10];
    }

    public String getOwner() {
        return owner;
    }

    public String getApart(int slot) {
        return apart[slot];
    }

    public void setApart(String name, int slot) {
        this.apart[slot] = name;
    }

    public int countApart() {
        int count = 0;
        for (int i = 0; i < apart.length; i++) {
            if(apart[i] != null) {
                count++;
            }
        }
        return count;
    }
    
    public void reorganizeApartments() {
        int position = -1;
        for (int i = 0; i < apart.length; i++) {
            if(this.apart[i] == null && position == -1) {
                position = i;
            }
            if(this.apart[i] != null && position != -1) {
                this.apart[position] = this.apart[i];
                this.apart[i] = null;
                position++;
            }
        }
    }

    @Override
    public String toString() {
        return "Apartment [owner=" + owner + ", apart=" + Arrays.toString(apart) + "]";
    }

    public static void main(String[] args) {
        Test p = new Test("Mario Rossi");
        p.setApart("Via della Camilluccia, 29", 0);
        p.setApart("Largo di Torre Argentina, 42", 1);
        p.setApart("P.zza Conca D’Oro, 9", 2);
        p.setApart("Via del Corso, 30", 5);
        p.setApart("Via Trionfale, 2500", 8);
        System.out.println(p);
        System.out.println();
        // System.out.println(p.getOwner() + " has " +
        // p.countApart() + " apartments");
        // System.out.println("Apartment 2: " + p.getApart(2));
        System.out.println();
        p.reorganizeApartments();
        System.out.println(p);
    }


    
}
