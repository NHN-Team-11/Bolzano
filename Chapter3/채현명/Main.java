package Chapter3.채현명;

public class Main {
    private static void printCarData(Car a) {
        System.out.println("Car: " + a.getPlate() + ", "
                + a.getModel() + ", "
                + a.getColor());
    }

    private static void printOwnerData(Car a) {
        System.out.println("Owner: " + a.getOwner().getName() + ", " + a.getOwner().getResidence());
    }

    public static void main(String[] args) {
        Car a = new Car("313", "Fiat 500", "Red and Blu");
        printCarData(a);
        Person p = new Person("Paperino", "Paperopoli");
        a.setOwner(p);
        printOwnerData(a);
        CarServices.spray(a, "Maranello Red");
        printCarData(a);
        Car b = CarServices.registerAlfa147("131", "Alfa Red");
        printCarData(b);
        Person c = new Person("Clarabella", "Topolinia");
        b.setOwner(c);
        printOwnerData(b);
    }
}