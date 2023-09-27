import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CarList {

    private String filename;

    CarList(String filename) {
        this.filename = filename;
    }

    public int countNewCars() throws IOException {
        FileReader fr = new FileReader(this.filename);
        BufferedReader br = new BufferedReader(fr);
        int count = 0;

        Car c = Car.read(br);
        while (c != null) {
            if (c.getKm() == 0) {
                count++;
            }
            c = Car.read(br);
        }
        br.close();
        return count;
    }

    public Car mostExpensiveCar() throws IOException {
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);

        Car c = Car.read(br);
        Car c2 = null;
        double max = 0;

        while (c != null) {
            if (max < c.getPrice()) {
                max = c.getPrice();
                c2 = c;
            }
            c = Car.read(br);
        }

        return c2;

    }

    public void addCar(Car c) throws IOException {

    }

}
