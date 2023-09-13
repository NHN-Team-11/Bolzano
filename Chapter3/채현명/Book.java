package Chapter3.채현명;

public class Book {
    private String title;
    private String author;
    private int price;

    public Book(String tit, String auth) {
        this.title = tit;
        this.author = auth;
    }

    public void printBook() {
        System.out.println("Title : " + this.title);
        System.out.println("Author : " + this.author);
    }

    public void printBookPrice() {
        System.out.println("Title : " + this.title);
        System.out.println("Author : " + this.author);
        System.out.println("Price : " + this.price);
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int pr) {
        this.price = pr;
    }

    // 3.6
    public static void setPrice2(Book book, int pr) {
        book.setPrice(pr);
    }

    public static void main(String[] args) {
        Book book = new Book("CHM", "Hi my dear");
        book.setPrice(10000);

        book.printBook();
        System.out.println("--------------------");
        book.printBookPrice();

    }
}
