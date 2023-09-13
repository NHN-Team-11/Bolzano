package Chapter3.채현명;

public class BookClient {
    public static void main(String[] args) {
        Book clientBook = new Book("Lee jung min", "How to make girlfriend");
        Book clientBook2 = new Book("Ha Jae Jun", "I hate Minseok");

        clientBook.printBook();
        System.out.println("------------------");
        clientBook2.printBook();
        System.out.println("------------------");

        clientBook.setPrice(200000);
        clientBook2.setPrice(9000000);

        clientBook.printBookPrice();
    }

}
