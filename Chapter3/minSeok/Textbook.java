public class Textbook extends Book {

    private String course;

    public String getCourse() {
        return course;
    }

    public Textbook(String name, String author, String course) {
        super(name, author);
        this.course = course;

    }

    @Override
    public void printBook() {
        // TODO Auto-generated method stub
        super.printBook();
        System.out.println("course : " + this.course);
    }

}
