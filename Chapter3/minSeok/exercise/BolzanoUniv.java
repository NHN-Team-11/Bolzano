public class BolzanoUniv extends Textbook {

    private String faculty;

    public BolzanoUniv(String name, String author, String course, String faculty) {
        super(name, author, course);
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    @Override
    public void printBook() {
        // TODO Auto-generated method stub
        super.printBook();
        System.out.println("Faculty : " + this.faculty);

    }
}
