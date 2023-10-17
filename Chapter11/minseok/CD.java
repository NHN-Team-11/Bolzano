package Chapter11.minseok;

public class CD {

    private String authors;
    private String title;
    private int year;
    private int price;
    public CD next;

    public CD(String authors, String title, int year, int price) {
        this.authors = authors;
        this.title = title;
        this.year = year;
        this.price = price;
        this.next = null;
    }

    public CD() {
    }

    public String getAuthors() {
        return authors;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public CD getNext() {
        return next;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setNext(CD next) {
        this.next = next;
    }

    public void add(CD current) {
    }

}
