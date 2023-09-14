import java.util.Scanner;

public class TestBook {

    public static Book makeBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("책 제목을 입력하세요 : ");
        String title = sc.next();
        System.out.print("저자를 입력하세요 : ");
        String author = sc.next();
        return new Book(title,author);
    }

    public static void main(String[] args) {
        Book book1 = makeBook();
        Book book2 = makeBook();

        Scanner scanner = new Scanner(System.in);
        book1.printBook();
        book2.printBook();
        System.out.print("첫번째 책의 가격은 : ");
        int price = scanner.nextInt();
        book1.setPrice(price);
        book1.printBookPrice();
    }


}
