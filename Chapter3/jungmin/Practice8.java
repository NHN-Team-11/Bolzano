package Bolzano.Chapter3.jungmin;

import Bolzano.Chapter3.jungmin.BookService6;

public class Practice8 {
    public static void main(String[] args) {
        Book1 book1 = new BolzanoUniversityTextBook("객체지향의 사실과 오해", "조영호", "객체지향", "이중민");
        book1.printBook();
        System.out.println("==============");
        Book1 book2 = new Book1("자료구조의 이해", "양성봉");
        Book1 novel = new Novel7(book2.getTitle(), book2.getAuthors(), "Fantasy");
        book2.printBook();
        System.out.println("==============");
        novel.printBook();
        System.out.println("==============");
        BookService6.price(book1, 16000);
        BookService6.price(book2, 10000);
        book1.printBookPrice();
        book2.printBookPrice();
       
    }
}
