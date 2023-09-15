package Chapter4.Minseok.exercise;

public class Product {
    private String name;
    private int count;

    public Product(String name) {
        this.name = name;
        this.count = 0;
    }

    public void downLoad(int num) {
        count += num;
    }

    public void upLoad(int num) {
        count -= num;
    }

    public String toString() {
        return name + ", " + count + "pieces";
    }

    public static char lastCharacter(String s) {
        return s.charAt(s.length() - 1);
    }

}
