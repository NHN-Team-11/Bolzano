package Chapter8.채현명;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex8 {
    private int size;
    private String address;
    private String[] residents;
    private int numberOfResidents;

    public Ex8(int size, String address) {
        this.size = size;
        this.address = address;
        this.residents = new String[10];
        this.numberOfResidents = 0;
    }

    public int getSize() {
        return size;
    }

    public String getAddress() {
        return address;
    }

    public int getNumberOfResidents() {
        return numberOfResidents;
    }

    public void addResident(String name) {
        if (numberOfResidents < 10) {
            residents[numberOfResidents] = name;
            numberOfResidents++;
        }
    }

    public String getResidentName(int number) {
        if (number >= 0 && number < numberOfResidents) {
            return residents[number];
        }
        return null;
    }

    public void removeResident(int number) {
        if (number >= 0 && number < numberOfResidents) {
            for (int i = number; i < numberOfResidents - 1; i++) {
                residents[i] = residents[i + 1];
            }
            residents[numberOfResidents - 1] = null;
            numberOfResidents--;
        }
    }

    public void saveToFile(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println(size);
            writer.println(address);
            writer.println(numberOfResidents);
            for (int i = 0; i < numberOfResidents; i++) {
                writer.println(residents[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Ex8 readFromFile(BufferedReader reader) throws IOException {
        int size = Integer.parseInt(reader.readLine());
        String address = reader.readLine();
        int numberOfResidents = Integer.parseInt(reader.readLine());
        Ex8 Ex8 = new Ex8(size, address);

        for (int i = 0; i < numberOfResidents; i++) {
            String residentName = reader.readLine();
            Ex8.addResident(residentName);
        }

        return Ex8;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("===========================\n");
        sb.append("size: ").append(size).append("\n");
        sb.append("주소: ").append(address).append("\n");
        sb.append("거주자 수: ").append(getNumberOfResidents()).append("\n");
        sb.append("거주자: \n");
        sb.append("===========================\n\n");

        for (int i = 0; i < numberOfResidents; i++) {
            sb.append(i).append(": ").append(residents[i]).append("\n");
        }

        return sb.toString();
    }
}
