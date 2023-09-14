public class Message {
    private String recipientNumber;
    private String senderNumber;
    private MessageText messageText;

    Message(String recipientNumber,String senderNumber,MessageText messageText) {
        this.recipientNumber = recipientNumber;
        this.senderNumber = senderNumber;
        this.messageText =messageText;
    }

    Message(String senderNumber,MessageText messageText) {
        this.senderNumber = senderNumber;
        this.messageText = messageText;
    }

    Message(MessageText messageText) {
        this.messageText = messageText;
    }

    public void setRecipientNumber(String phoneNumber) {
        this.recipientNumber = phoneNumber;
    }

    public void printMessage() {
        System.out.println(this.messageText.getText());
    }
}
