
public class Book {
    private String name;
    private String author;
    private int price;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public void printBook() {
        System.out.println("책의 제목: " + name + ", 책의 저자: " + author);
    }

    public String printBookPrice(Book book) {
        return "책의 제목: " + book.name + ", 책의 저자: " + book.author + "책의 가격: " + book.price + "원 입니다.";
    }

    public void windowBook() {
        printBook();
        printBook();
    }

    public String getTitle() {
        return name;
    }

    public String getAuthors() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
