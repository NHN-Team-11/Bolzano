package Chapter3.채현명;

public class CarServices {
    public static void spray(Car car, String color) {
        car.setColor(color);
    }

    public static Car registerAlfa147(String pla, String col) {
        return new Car(pla, "Alfa147", col);
    }
}