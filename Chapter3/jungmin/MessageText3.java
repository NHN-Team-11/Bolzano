package Bolzano.Chapter3.jungmin;
//Exercise 03.3
public class MessageText3 {
    private String code;
    private String message;

    public MessageText3(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String newMessage) {
        this.message = newMessage;
    }
}
