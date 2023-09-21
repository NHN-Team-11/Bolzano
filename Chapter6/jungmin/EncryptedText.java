package Chapter6.jungmin;

import Chapter5.jungmin.practice2;

public class EncryptedText {
    private String text;
    private int key;
    public EncryptedText(String nonEncryptionText, int encrypthonkey) {
        this.key = encrypthonkey;
        this.text = encode(nonEncryptionText, encrypthonkey);
    }

    public EncryptedText(String nonEncryptionText) {
        this.text = nonEncryptionText;
    }

    public String getEncrptedText() {
        return this.text;
    }

    public String getDecryptedText(int key) {
        
        if(keyProvided(key)) {
            return decode(this.text, key);
        }
        return "key가 틀렸습니다. " + this.text;
    }

    public boolean keyProvided(int key) {
        return this.key == key;
    }

    public void setKey(int key, int newKey) {
        if(keyProvided(key)) {
            this.key = newKey;
            this.text = encode(decode(text, key), newKey);
        }
        else 
            System.out.println("사용할 수 없음.");
    }

    private static String encode(String text, int key) {
        String str = "";
        for (int i = 0; i < text.length(); i++) {
            str += (char)(text.charAt(i) + key);
        }
        return str;
    }

    private static String decode(String text, int key) {
        String str = "";
        for (int i = 0; i < text.length(); i++) {
            str += (char)(text.charAt(i) - key);
        }
            return str;
    }

    public static void main(String[] args) {
        EncryptedText t = new EncryptedText("Lee Jung Min", 10);
        System.out.println(t.getEncrptedText());
        System.out.println(t.getDecryptedText(10));
        t.setKey(10, 20);
        System.out.println(t.getEncrptedText());
        System.out.println(t.getDecryptedText(20));
    }

    
}
