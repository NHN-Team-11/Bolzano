package Unit3;

public class ex3_2 {
    public static void main(String[] args) {
        Book book1 = new Book("자바의 정석", "남궁 성");
        Book book2 = new Book("자바의 정석2", "하재준");

        book1.printBook();
        book2.printBook();

        book1.setPrice(25000);

        System.out.println(book1.printBookPrice(book1));
    }

}
