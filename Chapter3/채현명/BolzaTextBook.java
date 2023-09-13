package Chapter3.채현명;

public class BolzaTextBook extends TextBook {

    private String faculty;

    public BolzaTextBook(String title, String author, String course, String faculty) {

        super(title, author, course);
        this.faculty = faculty;
    }

    @Override
    public void printBook() {
        super.printBook();
        System.out.println("Faculty : " + this.faculty);
    }
}
