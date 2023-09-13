package Chapter3.채현명;

public class TextBook extends Book {
    private String course;

    public TextBook(String title, String author, String pro) {
        super(title, author);
        this.course = pro;
    }

    public String getcourse() {
        return this.course;
    }

    @Override
    public void printBook() {
        super.printBook();
        System.out.println("course : " + this.course);
    }
}
