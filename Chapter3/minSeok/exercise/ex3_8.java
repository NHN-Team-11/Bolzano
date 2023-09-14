package exercise;

public class ex3_8 {
    public static void main(String[] args) {
        Book book1 = new BolzanoUniv("자바의 정석", "남궁성", "컴퓨터 공학", "문지환");
        book1.printBook();
        Book book2 = new Book("하재준", "채현명");
        book2.printBook();
        Book novel = new Textbook(book2.getTitle(), book2.getAuthors(), "라노벨");
        novel.printBook();
        Book.setPrice2(book1, 20000);
        book1.printBookPrice();

    }

}
