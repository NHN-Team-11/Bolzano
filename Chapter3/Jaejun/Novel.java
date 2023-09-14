public class Novel extends Book {

    public void setGenre(String genre) {
        this.genre = genre;
    }

    private String genre;
    Novel(String title, String author) {
        super(title, author);
    }

    Novel(String title,String author,String genre) {
        super(title,author);
        this.genre = genre;
    }

    public void printBook() {
        System.out.println("책 제목 [ " + getTitle() + " ]" + " 저자 : " + getAuthor());
        System.out.println("장르 : " + getGenre());

    }

    public String getGenre() {
        return this.genre;
    }
}
