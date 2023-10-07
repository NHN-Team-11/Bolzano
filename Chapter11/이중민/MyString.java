package Chapter11.이중민;

public class MyString {

    private char c;
    private MyString nextNode;

    public MyString() {}

    public MyString(String s) {
        
        if(s.length() >= 1) {
            this.c = s.charAt(0);
            if(!(s.length() == 1)) {
                this.nextNode = new MyString(s.substring(1));
            } 
        }

    }
    
    public MyString nextNode() {

        return this.nextNode;
    }

    public char getC() {
        return c;
    }

    public MyString getNextNode() {
        return nextNode;
    }

    public void setNextNode(MyString nextNode) {
        this.nextNode = nextNode;
    }
}