package Chapter8;

import java.io.BufferedReader;
import java.io.IOException;

public class Car {
    private String model;
    private int makeYear;
    private int mileage;
    private int price;
    
    public Car(String model, int makeYear, int mileage, int price) {
        this.model = model;
        this.makeYear = makeYear;
        this.mileage = mileage;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getMakeYear() {
        return makeYear;
    }

    public int getMileage() {
        return mileage;
    }

    public int getPrice() {
        return price;
    }

    public boolean equalTo(Car c) {
        return this.model.equals(c.model) &&
        this.makeYear == c.makeYear &&
        this.mileage == c.mileage &&
        this.price == c.price;
    }

    @Override
    public String toString() {
        return "Car [model=" + model + ", makeYear=" + makeYear + 
        ", mileage=" + mileage + ", price=" + price + "]";
    }

    public static Car read(BufferedReader br) throws IOException {
        String s = br.readLine();
        if (s == null)
            return null;
        else {
            return new Car(s, Integer.parseInt(s), 
            Integer.parseInt(s), Integer.parseInt(s));
        }
    }

}
