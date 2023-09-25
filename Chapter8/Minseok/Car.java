package Chapter8.Minseok;

public class Car {

    private String model;
    private int year;
    private int kilometers;
    private int price;

    public Car(String model, int year, int kilometers, int price) {
        this.model = model;
        this.year = year;
        this.kilometers = kilometers;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getKilometers() {
        return kilometers;
    }

    public int getPrice() {
        return price;
    }

    public boolean equalTo(Car c) {
        if ((this.model.equals(c.model)) &&
                (this.year == c.year) &&
                (this.kilometers == c.kilometers) &&
                (this.price == c.price)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Car [model=" + model + ", year=" + year +
                ", kilometers=" + kilometers + ", price=" + price + "]";
    }

}
