package Chapter3.채현명;

public class Car {
    private String plate;
    private String model;
    private String color;
    private Person owner;

    public Car(String p, String m, String c) {
        this.plate = p;
        this.model = m;
        this.color = c;
        this.owner = null;
    }

    public String getPlate() {
        return this.plate;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public Person getOwner() {
        return owner;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public void setOwner(Person newOwner) {
        this.owner = newOwner;
    }

}
