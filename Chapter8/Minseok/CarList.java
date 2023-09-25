package Chapter8.Minseok;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CarList {
    private String fileName;

    public CarList(String filename) {
        this.fileName = filename;
    }

    public int countNewCars() throws IOException {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);

        int count = 0;
        Car c = Car.read(br);

        return count;
    }
}
