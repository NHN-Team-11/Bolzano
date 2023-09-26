package Chapter7.이중민;

import java.io.IOException;

public class Test8 {
    public static void main(String[] args) throws IOException {
        
        String filename = "apartments.txt";

        
        Apartment apartment1 = new Apartment(1500, "ApartmentA");
        Apartment apartment2 = new Apartment(2000, "ApartmentB");

        apartment1.saveToFile(filename);
        apartment2.saveToFile(filename);

        Apartment.printApartmentFromFile(filename);
    }
}
