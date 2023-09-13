package Chapter3.채현명;

public class Novel extends Book {
    private String type;

    public Novel(String title, String author, String type) {
        super(title, author);
        this.type = type;
    }

    @Override
    public void printBook() {
        super.printBook();
        System.out.println("Type : " + this.type);
    }
}