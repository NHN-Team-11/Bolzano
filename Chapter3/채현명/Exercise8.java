package Chapter3.채현명;

public class Exercise8 {
    public static void main(String[] args) {
        Book book = new BolzaTextBook("소프트웨어공학", "신영숙", "1", "정보보안");
        book.printBook();
        System.out.println("====================");

        Book book2 = new Book("Real my sql", "박한이");
        book2.printBook();
        System.out.println("====================");

        Book novel = new Novel(book2.getTitle(), book2.getAuthor(), "디지털");
        novel.printBook();
        System.out.println("====================");

        Book.setPrice2(book, 2000000);
        book.printBookPrice();
    }
}
