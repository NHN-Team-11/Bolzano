package Chapter6.채현명;

public class Message {
    private String sender;
    private String receiver;
    private String text;

    public Message(String sender, String receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public void swapSenderReceiver() {
        String temp = sender;
        sender = receiver;
        receiver = temp;
    }

    public void deleteSpace() {
        text = text.trim().replaceAll("\\s+", " ");
    }

    public void removeVowels() {
        text = text.replaceAll("[aeiouAEIOU]", "");
    }

    public void compressAndRemoveVowels() {
        deleteSpace();
        removeVowels();
    }

    @Override
    public String toString() {
        return "발신자: " + sender + "\n수신자: " + receiver + "\nmessage: " + text;
    }

    public static void main(String[] args) {
        Message message = new Message("채현명", "하재준", "   Hello   World   ");

        System.out.println(message);
        System.out.println();

        message.swapSenderReceiver();
        System.out.println(message);
        System.out.println();

        message.deleteSpace();
        System.out.println(message);
        System.out.println();

        message.removeVowels();
        System.out.println(message);
        System.out.println();

        message.compressAndRemoveVowels();
        System.out.println(message);

    }
}
