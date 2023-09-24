package Chapter8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CarList {
    private String fileName;
    public CarList (String fn) {
        this.fileName = fn;
    }

    public int countNewCars() throws IOException {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);

        int count = 0;
        Car c = Car.read(br);
        while(c != null) {
            if (c.getMileage() == 0) {
                count++;
            }
            c = Car.read(br);
        }
        br.close();
        return count;
    }

    public Car mostExpensiveCar() throws IOException {
        FileInputStream is = new FileInputStream(fileName);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        Car c = Car.read(br);
        int max = 0;
        Car cmax = null;
        while(c != null) {
            if(c.getPrice() > max) {
                max = c.getPrice();
                cmax = c;
            }
            c = Car.read(br);
        }
        br.close();
        return cmax;
    }

    public void addCar(Car c) throws IOException {
        FileWriter fw = new FileWriter(fileName, true);
        PrintWriter pw = new PrintWriter(fw);

        pw.println(c.getModel());
        pw.println(c.getMakeYear());
        pw.println(c.getMileage());
        pw.println(c.getPrice());
        pw.close();
    }

    public void removeCar(Car c) throws IOException {
        File f = new File(fileName);
        FileInputStream is = new FileInputStream(f);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
    }
}
