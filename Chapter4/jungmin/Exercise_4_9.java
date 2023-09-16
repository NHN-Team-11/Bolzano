package Bolzano.Chapter4.jungmin;

public class Exercise_4_9 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        Product lamp = new Product("Lamp 60 wait");
        sb.append("Before thie loading: " + lamp).append("\n");
        lamp.downLoad(1000);
        lamp.upLoad(100);
        sb.append("After the loading: " + lamp).append("\n");
        sb.append(Product.lastCharacter("Good")).append("\n");

        System.out.println(sb);
        int a = 3;
        int b = 5;
        int c = a + b;
        System.out.println(sqr(c));
    }

    public static int sqr(int x) {
        return x * x;
    }
}
