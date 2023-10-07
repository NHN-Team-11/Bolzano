package Chapter11.이중민;

public class CD {
    private String author;
    private String title;
    private String year;
    private int price;
    private CD nextNode;

    public CD(){}
    public CD(String author, String title, String year, int price) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.price = price;
        this.nextNode = null;
    }

    public CD nextNode() {
        return this.nextNode;
    }

    public void setNextNode(CD nextNode) {
        this.nextNode = nextNode;
    }
    
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public String getYear() {
        return year;
    }
    public int getPrice() {
        return price;
    }
    public CD getNextNode() {
        return nextNode;
    }

    

}
