package Bolzano.Chapter3.jungmin;
// Exercise 03.2
public class ClientBook2 {
    public static void main(String[] args) {
        Book1 book1 = new Book1("자료구조의 이해", "양성봉");
        Book1 book2 = new Book1("객체지향의 사실과 오해", "조영호");
        book1.printBook();
        book2.printBook();
        BookService6.price(book1, 16000);
        book1.printBookPrice();
    }
}
