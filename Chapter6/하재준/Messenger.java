import java.util.StringTokenizer;

public class Messenger {
    private String sender;
    private String receiver;
    private String text;

    Messenger(String sender, String receiver, String text) {
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

    public void setText(String text) {
        this.text = text;
    }

    public void removeWhiteSpaceText() {
        StringTokenizer st = new StringTokenizer(this.text);
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()) {
            sb.append(st.nextToken() + " ");
        }

        setText(sb.toString().trim());
    }

    public void removeVowels() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.text.length(); i++) {
            if (this.text.charAt(i) != 'a' &&
                    this.text.charAt(i) != 'e' &&
                    this.text.charAt(i) != 'i' &&
                    this.text.charAt(i) != 'o' &&
                    this.text.charAt(i) != 'u' &&
                    this.text.charAt(i) != 'A' &&
                    this.text.charAt(i) != 'E' &&
                    this.text.charAt(i) != 'I' &&
                    this.text.charAt(i) != 'O' &&
                    this.text.charAt(i) != 'U') {
                sb.append(this.text.charAt(i));
            }
        }
        setText(sb.toString());
    }

    public void bothEffect() {
        removeWhiteSpaceText();
        bothEffect();
    }

    public String toString() {
        return "보낸 사람: " + this.getSender() + "    받는 사람: " + this.getReceiver() + "\n" + getText();
    }

    public static void main(String[] args) {
        Messenger messenger = new Messenger("하재준", "채현명", "  hi       hyun myoung z   zz    ");
        System.out.println(messenger.getText());
        messenger.removeWhiteSpaceText();
        System.out.println(messenger.getText());
        messenger.removeVowels();
        System.out.println(messenger.getText());
        System.out.println(messenger.toString());

    }

}
