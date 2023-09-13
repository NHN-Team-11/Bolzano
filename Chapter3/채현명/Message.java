package Chapter3.채현명;

public class Message {
    private String sendNumber;
    private String reciveNumber;
    private MessageText messageText;

    public Message(MessageText messageText, String sendNumber, String reciveNumber) {
        this.messageText = messageText;
        this.sendNumber = sendNumber;
        this.reciveNumber = reciveNumber;
    }

    public Message(MessageText messageText, String reciveNumber) {
        this.messageText = messageText;
        this.reciveNumber = reciveNumber;
    }

    public Message(MessageText messageText) {
        this.messageText = messageText;
    }

    public void addPhoneNumber(String newPhoneNumber) {
        if (newPhoneNumber.isEmpty()) {
            throw new IllegalArgumentException("empty!");
        } else {
            this.sendNumber = newPhoneNumber;
        }

    }

    public void printMessage() {
        System.out.println("Recive : " + this.reciveNumber);
        System.out.println("Send : " + this.sendNumber);
        System.out.println(messageText.getMessage());
    }
}
