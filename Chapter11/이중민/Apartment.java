package Chapter11.이중민;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Apartment {
    private int size;
    private String address;
    private ListOfPersons<Person> listOfPersons;

    public Apartment(int size, String address, ListOfPersons<Person> listOfPersons) {
        this.size = size;
        this.address = address;
        this.listOfPersons = listOfPersons;
    }

    

    public int getSize() {
        return this.size;
    }

    public String getAddress() {
        return this.address;
    }
    
    public int countPerson() {
        return listOfPersons.size();
    }

    public void setApartment(Person p) {
    
        listOfPersons.add(p);
    }

    public String getOwnerName(int apartmentNumber) {
        int peoples = countPerson();
        Person current = listOfPersons.getHead();
        int count = 1;

        if(apartmentNumber >= peoples) {
            return null;
        }
        while(current != null) {
            
            if(count == apartmentNumber) {
                return current.getName();
            }
            count++;
            current = current.nextNode();
        }
        return null;
    }

    public void outOwner(int apartmentNumber) {
        int ownerNumber = countPerson();
        Person current = listOfPersons.getHead();
        int count = 1;

        if(ownerNumber <= apartmentNumber) {
            return;
        }
        while(current != null) {
            
            if(count == apartmentNumber) {
                listOfPersons.delete(current.getName());
            }
            count++;
            current = current.nextNode();
        }
    }

    public boolean checkFamily() {
        Person current = listOfPersons.getHead();
        Person copy = listOfPersons.getHead();
        while(current != null) {
            if(!current.getSurName().equals(copy.getSurName())) {
                return false;
            }
            current = current.nextNode();
        }
        return true;
    }

    
    // @Override
    // public String toString() {
    //     return "Apartment [size=" + size + " square meter" + ", address=" + address + 
    //     ", apartment=" + Arrays.toString(apartment) + "]";
    // }

    public void saveToFile(String fileName) throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter(fileName, true));
        
        writer.print(getSize() + " ");
        writer.println(getAddress());
    
        writer.close();
    }
    
    public static Apartment readFromFile(BufferedReader br) throws IOException {
        String line = null;
        ListOfPersons<Person> listOfPersons = new ListOfPersons<>();
        while((line = br.readLine()) != null) {
            String[] arr = line.split(" ");
            return new Apartment(Integer.parseInt(arr[0]), arr[1], listOfPersons);
        }
        return null;
    }

    public static void printApartmentFromFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));

        String line = null;
        while((line = br.readLine()) != null) {
            Apartment apartment = readFromFile(br);
            System.out.println(apartment.toString());
        }
        br.close();
    }

    public static void main(String[] args) {
        ListOfPersons<Person> listOfPersons = new ListOfPersons<>();
        Apartment apartment = new Apartment(10, "abc", listOfPersons);

        Person person = new Person("Jung Min", "Lee", 25, "Mok po");
        Person person2 = new Person("Youn Ho", "Kim", 24, "Mok po");
        Person person3 = new Person("Hyun Myeong", "Lee", 23, "Gun san");

        apartment.setApartment(person);
        apartment.setApartment(person2);
        apartment.setApartment(person3);
        System.out.println(apartment.getOwnerName(2));
        apartment.outOwner(2);
        System.out.println(apartment.checkFamily());
        // listOfPersons.print(System.out);
        
    }
}

