public class EncryptedText {
    private int key;
    private String text;

    public EncryptedText(String nonEncryptedText) {
        key = 0;
        text = nonEncryptedText;
    }

    public EncryptedText(String nonEncryptedText, int key) {
        this.key = key;
        text = nonEncryptedText;
    }

    public String getEncryptedText() {
        return text;
    }

    public String getDecryptedText(int key) {
        if (key == this.key) {
            return decode(text, key);
        } else {
            return null;
        }
    }

    public boolean isKey(int candidateKey) {
        return candidateKey == key;
    }

    public void setKey(int key, int newKey) {
        if (key == this.key) {
            this.key = newKey;
            text = encode(decode(text, key), newKey);
        }
    }

    private static String encode(String text, int Key) {
        String resText;
        char c;
        int ci;
        resText = "";
        for (int i = 0; i < text.length(); i++) {
            c = text.charAt(i);
            ci = (int) c;
            ci = ci + Key;
            c = (char) ci;
            resText = resText + String.valueOf(c);
        }
        return resText;
    }

    private static String decode(String text, int key) {
        String resText;
        char c;
        int ci;
        resText = "";
        for (int i = 0; i < text.length(); i++) {
            c = text.charAt(i);
            ci = (int) c;
            ci = ci - key;
            c = (char) ci;
            resText = resText + String.valueOf(c);
        }
        return resText;
    }

}
