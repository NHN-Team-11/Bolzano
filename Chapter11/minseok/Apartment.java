package Chapter11.minseok;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
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

    public int getNumberOfPerson(ListOfPersons listOfPersons) {
        return listOfPersons.size();
    }

    public void setApartment(Person p) {
        residents.add(p);
    }

    public String getOwnerName(int apartmentNumber) {
        int count = 0;
        Person p = residents.getA();
        String name = "";
        if (getNumberOfPerson(residents) <= apartmentNumber) {
            return null;
        } else {
            while (residents != null) {
                if (count == apartmentNumber) {
                    name = p.getName();
                    break;
                }
                count++;
            }
        }
        return name;

    }

    public void outOwner(int apartmentNumber, ListOfPersons listOfPersons) {
        int count = 0;
        Person p = residents.getA();

        while (residents != null) {
            if (count == apartmentNumber) {
                listOfPersons.delete(p.getName());
                break;
            }
            count++;
        }
    }

    public int countPersons() {
        return residents.size();
    }

    public boolean checkFamily(String surname) {
        int count = 0;
        Person p = residents.getA();
        while (residents != null) {
            if (p.getSurname().equals(surname)) {
                count++;
            }
        }
        if (count == residents.size()) {
            return true;
        }
        return false;
    }

    // @Override
    // public String toString() {
    // return "Apartment [size=" + size + " square meter" + ", address=" + address +
    // ", apartment=" + Arrays.toString(apartment) + "]";
    // }

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
}
