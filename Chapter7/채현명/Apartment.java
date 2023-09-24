package Chapter7.채현명;

public class Apartment {
    private int size;
    private String address;
    private String[] residents;
    private int numberOfResidents;

    public Apartment(int size, String address) {
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
