package exercise;

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

    public void printBookPrice() {
        System.out.println("책의 제목: " + name + ", 책의 저자: " + author + "책의 가격: " + price + "원 입니다.");
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

    // ex3_6
    public static void setPrice2(Book book, int price) {
        book.setPrice(price);
    }

    public static void main(String[] args) {
        Book book1 = new Book("자바의 정석", "남궁 성");
        Book book2 = new Book("자바의 정석2", "하재준");

        book1.printBook();
        book2.printBook();

        book1.setPrice(25000);
        book2.setPrice2(book2, 20000);

        book1.printBookPrice();
        book2.printBookPrice();
    }

}
