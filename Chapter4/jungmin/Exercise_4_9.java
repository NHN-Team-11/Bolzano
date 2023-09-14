package Bolzano.Chapter4.jungmin;

public class Exercise_4_9 {
    public static void main(String[] args) {
        Product lamp = new Product("Lamp 60 wait");
        System.out.println("Before thie loading: " + lamp);
        lamp.downLoad(1000);
        lamp.upLoad(100);
        System.out.println("After the loading: " + lamp);
        System.out.println(lamp.lastCharacter("Good"));
    }
}
