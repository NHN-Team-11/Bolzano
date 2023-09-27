package ColaboExercise.Chap6;

public class Talk {
    private String sender;
    private String receiver;
    private String message;   

    public Talk(String sender, String receiver, String message) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
    }

    public void change() {
        String temp = this.sender;
        this.sender = this.receiver;
        this.receiver = temp;
    }

    public String getSender() {
        return this.sender;
    }

    public String getReceiver() {
        return this.receiver;
    }

    public String getMessage() {
        return changeMessage(this.message);
    }

    public void setMessage(String newMessage) {
        this.message = newMessage;
    }

    public String deleteVocal(String message) {
        message = message.replaceAll("[AEIOUaeiou]", "");
        return message;
    }

    public String changeMessage(String message) {

        String str = "";
        message = deleteVocal(message);
        int count = 0;
        for (int i = 0; i < message.length() - 1; i++) {
            if(message.charAt(i) == ' ') {
                count++;
                if(count > 1) {
                    continue;
                }
                else {
                    str += message.charAt(i);
                }
            }
            else {
                count = 0;
                str += message.charAt(i);
            }
            
        }
        return str.trim();
    }

    

    public static void main(String[] args) {
        Talk talk = new Talk("LEE", "KIM", " Hello   World! ");
        System.out.println(talk.getMessage());
        System.out.println(talk.getReceiver());
        talk.change();
        System.out.println(talk.getReceiver());
        talk.setMessage("fuck aeiou yoU ");
        System.out.println(talk.getMessage());
        
    }
    
}
