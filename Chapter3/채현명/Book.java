package Chapter3.채현명;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
        //StringBuilder사용
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

    public static String getRead() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        return line;
    }
}
