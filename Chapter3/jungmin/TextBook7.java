package Bolzano.Chapter3.jungmin;

public class TextBook7 extends Book1 {
    private String process;
    public TextBook7(String title, String authors, String process) {
        super(title, authors);
        this.process = process;
    }

    public String getProcess() {
        return this.process;
    }

    @Override
    public void printBook() {
        System.out.println("title: " + this.getTitle());
        System.out.println("authors: " + this.getAuthors());
        System.out.println("process: " + this.process);
    }
}
