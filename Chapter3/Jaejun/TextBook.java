public class TextBook extends Book {
    private String lecture;
    private String faculty;
    private
    TextBook(String title, String author) {
        super(title, author);
    }

    TextBook(String title,String author,String lecture,String faculty) {
        super(title,author);
        this.lecture = lecture;
        this.faculty = faculty;
    }

    public String getLecture() {
        return this.lecture;
    }

    public String getFaculty() {
        return this.faculty;
    }


    public void printBook(){
        System.out.println("책 제목 [ " + getTitle() + " ]" + " 저자 : " + getAuthor());
        System.out.println("강좌 : " + getLecture());
        System.out.println("해당 책을 채택한 교수진 : " + getFaculty());
    }


}
