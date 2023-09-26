package Chapter8.채현명;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CarList {
    private String fileName;

    public CarList(String fn) {
        this.fileName = fn;
    }

    public int countNewCars() throws IOException {
        FileReader fr = new FileReader(this.fileName);
        BufferedReader br = new BufferedReader(fr);

        int count = 0;
        Car c = Car.read(br);
        while (c != null) {
            if (c.getKm() == 0)
                count++;
            c = Car.read(br);
        }
        br.close();
        return count;
    }

    public Car mostExpensiveCar() throws IOException {
        FileInputStream is = new FileInputStream(this.fileName);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        double max = 0;
        Car cmax = null;
        Car c = Car.read(br);
        while (c != null) {
            if (c.getPrice() > max) {
                max = c.getPrice();
                cmax = c;
            }
            c = Car.read(br);
        }
        br.close();
        return cmax;
    }

    public void addCar(Car c) throws IOException {
        FileWriter fw = new FileWriter(this.fileName, true);
        PrintWriter pw = new PrintWriter(fw);

        pw.println(c.getModel());
        pw.println(c.getKm());
        pw.println(c.getPrice());
        pw.println(c.getYear());
        pw.close();
    }

    public void removeCar(Car c) throws IOException {
        File f = new File(this.fileName);
        FileInputStream is = new FileInputStream(f);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        File ftemp = new File("cars-temporary.txt");
        FileOutputStream os = new FileOutputStream(ftemp);
        PrintWriter pw = new PrintWriter(os);
        Car curr = Car.read(br);
        while (curr != null) {
            if (!curr.equalTo(c)) {
                pw.println(curr.getModel());
                pw.println(curr.getYear());
                pw.println(curr.getKm());
                pw.println(curr.getPrice());
            }
            curr = Car.read(br);
        }
        br.close();
        pw.close();
        ftemp.renameTo(f);
    }

}
