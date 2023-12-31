package Bolzano.Chapter3.jungmin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Exercise 03.1
public class Book1 {
    private String title;
    private String authors;
    private int price;

    public Book1(String title, String authors) {
        this.title = title;
        this.authors = authors;
    }

    public void printBook() {
        System.out.println("title : " + this.title);
        System.out.println("authors : " + this.authors);
    }

    public void printBookPrice() {
        System.out.println("title: "+this.title + " author: " + this.authors + " price: " + this.price +"원 입니다.");
    }

    public String getTitle() {
        return this.title;
    }
    public String getAuthors() {
        return this.authors;
    }
    public int getPrice() {
        return this.price;
    }

    public void setPrice(int newPrice) {
        this.price = newPrice;
    }

    public static String read() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        br.close();
        return line;
    }
}