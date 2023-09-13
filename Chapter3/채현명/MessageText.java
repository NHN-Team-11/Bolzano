package Chapter3.채현명;

public class MessageText {
    private String code;
    private String message;

    public MessageText(String cd, String msg) {
        this.code = cd;
        this.message = msg;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String newmsg) {
        this.message = newmsg;
    }

    // 3.6
    public static void setMessage2(MessageText messageText, String newmsg) {
        messageText.setMessage(newmsg);
    }
}
