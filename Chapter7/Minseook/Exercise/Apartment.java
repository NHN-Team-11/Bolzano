package Chapter7.Minseook.Exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Apartment {
    private int size;
    private String address;
    private String[] personNames;
    private int roomNumber;

    public Apartment(int size, String address) {
        this.size = size;
        this.address = address;
        this.personNames = new String[size];
        this.roomNumber = 0;
    }

    public int getSize() {
        return this.size;
    }

    public String getAddress() {
        return this.address;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public int getNumberResidents() {
        int count = 0;
        for (int i = 0; i < personNames.length; i++) {
            if (personNames[i] != null) {
                count++;
            }
        }
        return count;
    }

    public void newPerson(String person) {
        boolean isFool = true;
        for (int i = 0; i < personNames.length; i++) {
            if (personNames[i] == null)
                isFool = false;
        }
        if (!isFool) {
            personNames[this.roomNumber] = person;
            this.roomNumber++;
        }
    }

    public String getPerson(int number) {
        if (number > roomNumber) {
            return null;
        }
        return personNames[number];
    }

    public void removePerson(int number) {
        if (this.roomNumber > number) {
            for (int i = number; i < this.roomNumber - 1; i++) {
                personNames[i] = personNames[i + 1];
            }
            personNames[roomNumber - 1] = null;
            this.roomNumber -= 1;
        }
    }

    @Override
    public String toString() {
        return "아파트 주소: " + this.getAddress() + "\n아파트 크기: " + this.getSize() + "층\n거주자 목록 "
                + Arrays.toString(personNames) + "\n" + this.getNumberResidents() + " 명이 거주중입니다.";

    }

    public void saveToFile(String filename) throws IOException {
        FileWriter fw = new FileWriter(filename, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(getAddress());
        pw.println(getSize());
        for (int i = 0; i < personNames.length; i++) {
            pw.print(getPerson(i));
        }
    }

    public static Apartment readFromFile(BufferedReader br) throws IOException {
        String address = br.readLine();
        int size = Integer.parseInt(br.readLine());
        return new Apartment(size, address);
    }

    public static void printFromFile(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            Apartment apartment = Apartment.readFromFile(br);
            System.out.println(apartment);
        }
    }
}
