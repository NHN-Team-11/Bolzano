public class Message {
    private String sendphoneNumber;
    private String reciphoneNumber;
    private MessageText messageText;

    public Message(String send, String recive, MessageText messageText) {
        this.sendphoneNumber = send;
        this.reciphoneNumber = recive;
        this.messageText = messageText;
    }

    public Message(MessageText messageText, String reciveNumber) {
        this.messageText = messageText;
        this.reciphoneNumber = reciveNumber;
    }

    public Message(MessageText messageText) {
        this.messageText = messageText;
    }

    public void addPhoneNumber(String newPhoneNumber) {
        if (newPhoneNumber.isEmpty()) {
            throw new IllegalArgumentException("empty!");
        } else {
            this.sendphoneNumber = newPhoneNumber;
        }

    }

    public void printMessage() {
        System.out.println("Recive : " + this.reciphoneNumber);
        System.out.println("Send : " + this.sendphoneNumber);
        System.out.println(messageText.getMessage());
    }

}
