package Chapter4.채현명;

public class Product {

    private String productName;
    private int productNum;

    public Product(String string) {
        this.productName = string;
    }

    public void downLoad(int i) {
        this.productNum -= i;
    }

    public String toString() {
        return this.productName + "," + this.productNum;
    }

    public void upLoad(int i) {
        this.productNum += i;
    }

}

class TestProduct {
    public static void main(String[] args) {
        Product lamp = new Product("Lamp 60 Watt");
        System.out.println("Before the loading: " + lamp);
        lamp.downLoad(1000);
        lamp.upLoad(100);
        System.out.println("After the loading: " + lamp);
    }
}