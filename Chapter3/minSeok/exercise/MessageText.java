public class MessageText {
    private String code;
    private String message;

    public MessageText(String code, String msg) {
        this.code = code;
        this.message = msg;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static void setMessage2(MessageText msg, String message) {
        msg.setMessage(message);
    }

}
