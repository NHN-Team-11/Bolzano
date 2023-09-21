package Chapter6.minseok.exercise;

public class Message {
    private String reciver;
    private String sender;
    private String message;

    public Message(String reci, String send, String msg) {
        this.reciver = reci;
        this.sender = send;
        this.message = msg;

    }

    public void change() {
        String temp = reciver;
        reciver = sender;
        sender = temp;
    }

    public String getReciver() {
        return reciver;
    }

    public String getSender() {
        return sender;
    }

    public String getMessage() {
        delete();
        return changeMsg(message);
    }

    public void delete() {
        this.message = this.message.replaceAll("[AEIOUaeiou]", "");

    }

    public void setMessage(String msg) {
        this.message = msg;
    }

    public String changeMsg(String msg) {
        int count = 0;
        String s = "";
        for (int i = 0; i < msg.length(); i++) {
            if (msg.charAt(i) == ' ') {
                count++;
                if (count > 1) {
                    continue;
                } else {
                    s = s + msg.charAt(i);
                }
            } else {
                s = s + msg.charAt(i);
            }
        }
        return s.trim();
    }

    public static void main(String[] args) {
        Message msg = new Message("Kim", "Ha", " Hello   World!       ");
        System.out.println(msg.getMessage());
        System.out.println(msg.getReciver());
        msg.change();
        System.out.println(msg.getReciver());
        msg.setMessage("love aeiou yoU ");
        System.out.println(msg.getMessage());

    }

}