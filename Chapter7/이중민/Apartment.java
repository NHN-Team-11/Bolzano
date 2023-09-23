package Chapter7.이중민;

import java.util.Arrays;

public class Apartment {
    private int size;
    private String address;
    private String[] apartment;

    public Apartment(int size, String address) {
        this.size = size;
        this.address = address;
        this.apartment = new String[10];
    }

    public int getSize() {
        return this.size;
    }

    public String getAddress() {
        return this.address;
    }
    
    public int getNumberOfPerson() {
        int count = 0;
        for (int i = 0; i < apartment.length; i++) {
            if(apartment[i] != null){
                count++;
            }
        }
        return count;
    }

    public void setApartment(String name) {
        if(getNumberOfPerson() == 10) {
            return;
        }

        for (int i = 0; i < apartment.length; i++) {
            if(apartment[i] == null) {
                apartment[i] = name; 
                break;
            }
        }
    }

    public String getOwnerName(int apartmentNumber) {
        if(getNumberOfPerson() <= apartmentNumber) {
            return null;
        }
        return apartment[apartmentNumber];
    }

    public void outOwner(int apartmentNumber) {
        int ownerNumber = getNumberOfPerson();
        if(ownerNumber <= apartmentNumber) {
            return;
        }
        apartment[apartmentNumber] = null;
        for (int i = apartmentNumber; i < ownerNumber - 1; i++) {
            String temp = apartment[i];
            apartment[i] = apartment[i+1];
            apartment[i + 1] = temp;
        }
    }

    @Override
    public String toString() {
        return "Apartment [size=" + size + " square meter" + ", address=" + address + 
        ", apartment=" + Arrays.toString(apartment) + "]";
    }

    
    
}
