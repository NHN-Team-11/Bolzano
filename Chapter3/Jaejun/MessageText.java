import java.util.Scanner;

public class MessageText {
    private String code;
    private String text;

    MessageText(String code,String text) {
        this.code = code;
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public static MessageText createMessage() {
        Scanner sc = new Scanner(System.in);
        System.out.print("코드를 입력하세요 : ");
        String code = sc.next();
        System.out.print("텍스트를 입력하세요 : ");
        String text = sc.next();
        return new MessageText(code,text);
    }
}
