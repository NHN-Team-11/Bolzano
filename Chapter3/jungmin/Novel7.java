package Bolzano.Chapter3.jungmin;

public class Novel7 extends Book1 {
    private String genre;
    public Novel7(String title, String authors, String genre) {
        super(title, authors);
        this.genre = genre;
    }

    public String getGenre() {
        return this.genre;
    }

    @Override
    public void printBook() {
        // System.out.println("title: " + this.getTitle());
        // System.out.println("authors: " + this.getAuthors());
        super.printBook();
        System.out.println("genre: " + this.genre);
    }


}
