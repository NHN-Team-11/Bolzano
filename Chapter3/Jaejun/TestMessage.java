import java.util.Scanner;

public class TestMessage {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phoneNumber;
        MessageText messageText = MessageText.createMessage();
        System.out.print("수신자의 번호를 입력해주세요 : ");
        phoneNumber = sc.next();
        Message message = new Message("010-9450-8581",messageText);
        message.printMessage();


    }
}
