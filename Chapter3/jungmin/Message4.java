package Bolzano.Chapter3.jungmin;
//Exercise 03.4
public class Message4 {
    private MessageText3 messageText;
    private String callNumber;
    private String senderNumber;
    private String message;

    public Message4(MessageText3 messageText, String callNumber, String senderNumber) {
        this.messageText = messageText;
        this.callNumber = callNumber;
        this.senderNumber = senderNumber;
    }

    public Message4(MessageText3 messageText, String senderNumber) {
        this.messageText = messageText;
        this.senderNumber = senderNumber;
    }

    public Message4(MessageText3 messageText) {
        this.messageText = messageText;
    }

    public void setCallNumber(String phoneNumber) {
        this.callNumber = phoneNumber;
    }
    public void printMessage() {
        System.out.println(messageText.getMessage());
    }
}
