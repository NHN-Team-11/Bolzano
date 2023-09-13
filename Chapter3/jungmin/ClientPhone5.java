package Bolzano.Chapter3.jungmin;
//Exercise 03.5 - 3 수신자의 전화번호를 읽으라는 문제를 이해 못함.
public class ClientPhone5 {
    public static void main(String[] args) {
        String phoneNumber = "010-9205-9624";
        MessageText3 messageText = new MessageText3("HL", "HELLO!!");
        System.out.println(messageText.getMessage());

        MessageTextService6.message(messageText, "Holy!!");
        System.out.println(messageText.getMessage());

        Message4 message = new Message4(messageText);
        Message4 message2 = new Message4(messageText, phoneNumber, "010-1234-5678");
        
        message2.setCallNumber("010-1243-1231");
        message.printMessage();
    }
}
