package Chapter11.minseok;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Apartment {

    private int size;
    private String address;
    private ListOfPersons residents;

    public Apartment(int size, String address) {
        this.size = size;
        this.address = address;
        this.residents = new ListOfPersons();
    }

    public int getSize() {
        return this.size;
    }

    public String getAddress() {
        return this.address;
    }

    public int getNumberOfPerson() {
        int count = 0;
        for (int i = 0; i < residents.getN(); i++) {
            if (residents.getA()[i] != null) {
                count++;
            }
        }
        return count;
    }

    public void setApartment(String name) {
        if (getNumberOfPerson() == 10) {
            return;
        }
        residents.add(new Person(name));
    }

    public String getOwnerName(int apartmentNumber) {
        return residents.getPersonName(apartmentNumber);
    }

    public void outOwner(int apartmentNumber) {
        residents.remove(apartmentNumber);
    }

    @Override
    public String toString() {
        return "Apartment [size=" + size + " square meter" + ", address=" + address +
                ", residents=" + residents.toString() + "]";
    }

    public void saveToFile(String fileName) throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter(fileName, true));

        writer.print(getSize() + " ");
        writer.println(getAddress());

        writer.close();
    }

    public static Apartment readFromFile(BufferedReader br) throws IOException {
        String line = null;

        while ((line = br.readLine()) != null) {
            String[] arr = line.split(" ");
            return new Apartment(Integer.parseInt(arr[0]), arr[1]);
        }
        return null;
    }

    public static void printApartmentFromFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));

        String line = null;
        while ((line = br.readLine()) != null) {
            Apartment apartment = readFromFile(br);
            System.out.println(apartment.toString());
        }
        br.close();
    }

    public int countPersons() {
        return residents.getN();
    }

    public boolean checkFamliy(Person p) {
        if (residents.getN() <= 1) {
            return true;
        }
        String surname = p.getSurname();

        for (int i = 1; i <= residents.getN(); i++) {
            if (residents.getPersonName(i).equals(surname)) {
                return true;
            }
        }
        return false;

    }
}