package Bolzano.Chapter3.jungmin;

public class BolzanoUniversityTextBook extends TextBook7 {

    private String faculty;
    public BolzanoUniversityTextBook(String title, String authors, String process, String faculty) {
        super(title, authors, process);
        this.faculty = faculty;
    }

    public String getFaculty() {
        return this.faculty;
    }

    @Override
    public void printBook() {
        System.out.println("title: " + this.getTitle());
        System.out.println("authors: " + this.getAuthors());
        System.out.println("process: " + this.getProcess());
        System.out.println("faculty: " + this.faculty);
    }

    @Override
    public void printBookPrice() {
        System.out.println("title: "+this.getTitle() + " author: " + this.getAuthors() + " process: " + this.getProcess() 
        + " faculity: " + this.faculty + " price: " + this.getPrice() +"원 입니다.");
    }
}
