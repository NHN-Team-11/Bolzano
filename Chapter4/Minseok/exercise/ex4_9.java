package Chapter4.Minseok.exercise;

public class ex4_9 {
    public static void main(String[] args) {
        Product pr = new Product("Lamp 60 wait");
        System.out.println("Before thie loading: " + pr);
        pr.downLoad(1000);
        pr.upLoad(100);
        System.out.println("After the loading: " + pr);
        System.out.println(pr.lastCharacter("nice"));
    }

}
