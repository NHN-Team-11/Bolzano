public class Book {
    private String title;
    private String author;
    private int price;

    Book(String title,String author) {
        this.title = title;
        this.author = author;
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

    public void setPrice(int price) {
        this.price = price;
    }

    public void printBook() {
        System.out.println("책 제목 [ " + getTitle() + " ]");
        System.out.println("저자 : " + getAuthor());
    }

    public void printBookPrice() {
        System.out.println("책 제목 [ " + getTitle() + " ]" + " 저자 : " + getAuthor());
        System.out.println("가격은 " + getPrice() + "원입니다.");
    }



}
