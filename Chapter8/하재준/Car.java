import java.io.BufferedReader;
import java.io.IOException;

public class Car {
    private String model;
    private int year;
    private int km;
    private double price;

    public Car(String m, int y, int k, double p) {
        this.model = m;
        this.year = y;
        this.km = k;
        this.price = p;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getKm() {
        return km;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car [model=" + model + ", year=" + year + ", km=" + km + ", price=" + price + "]";
    }

    public boolean equalTo(Car c) {
        if (this.model == c.model && this.km == c.km && this.price == c.price && this.year == c.year) {
            return true;
        }
        return false;
    }

    public static Car read(BufferedReader br) throws IOException {
        String s = br.readLine();
        if (s == null) {
            return null;
        } else {
            return new Car(s, Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()),
                    Double.parseDouble(br.readLine()));
        }
    }
}
