package Chapter11.이중민;

import java.io.PrintStream;

public class StringJM {

    private MyString head;

    public String concat(String str) {

        String result = new String();
        if(head == null) {
            head = new MyString(str);
        }

        else {
            MyString current = head;
            while(current.nextNode() != null) {
                current = current.nextNode();
            }
            current.setNextNode(new MyString(str));
        }

        MyString current = head;
        result = print(current);
        return result;
    }

    public String print(MyString myString) {
        String result = new String();
        while(myString != null) {
            result += myString.getC();
            myString = myString.nextNode();
        }
        return result;
    }


    public boolean equals(String str) {
        MyString myString = new MyString(str);
        MyString current = head;

        if(length() != str.length()) {
            return false;
        }

        while(current != null) {
            if(current.getC() != myString.getC()) {
                return false;
            }
            current = current.nextNode();
            myString = myString.nextNode(); 
        }
        return true;
    }

    public MyString subString(int index) {

        MyString current = head;
        MyString result = null;
        int count = 0;
        if(index == 0) {
            return current;
        }
        else {
            while(current != null) {
                if(count == index) {
                    result = current;
                }
                count++;
                current = current.nextNode();
            }
        }
        return result;
    }

    //Overloading
    public String subString(int startIndex, int endIndex) {
        MyString current = head;
        String result = new String();

        int count = 0;
        while(current != null) {
            if(count >= startIndex && count < endIndex) {
                result += current.getC();
            } 
            count++;
            current = current.nextNode();
        }
        return result;
    }

    public int length() {
        int count = 0;
        MyString current = head;
        while(current != null) {
            count++;
            current = current.nextNode();
        }
        return count;
    }

    public char charAt(int index) {
        MyString current = head;
        int count = 0;
        char result = ' ';
        if(index >= length()) {
            throw new StringIndexOutOfBoundsException("글자 수 초과!");
        }
        while (current != null) {
            if(count == index) {
                result = current.getC();
            }
            count++;
            current =current.nextNode();
        }
        return result;
    }

    public int indexOf(char ch) {
        int count = 0;
        MyString current = head;
        
        while(current != null) {
            if(ch == current.getC()) {
                return count;
            }
            count++;
            current = current.nextNode();
        }
        return -1;
    }

    public String toUpperCase() {
        MyString current = head;
        String result = new String();
        while(current != null) {
            if('A' <= current.getC() && current.getC() <= 'Z') {
                result += current.getC();
                current = current.nextNode();
                continue;
            }
            else if('a' <= current.getC() && current.getC() <= 'z') {
                char c = (char)(current.getC() - 32);
                result += c;
            }
            else {
                result += current.getC();
            }
            current = current.nextNode();
        }
        return result;
    } 

    public int parseInt(MyString str) {
        MyString current = str;
        int result = 0;

        while(current != null) {
            if('0' <= current.getC() && current.getC() <= '9'){
                result = result * 10 + (current.getC() - '0');
            }
            else {
                throw new NumberFormatException("숫자가 아닌 것이 있습니다.");
            }
            current = current.nextNode();
        }
        return result;
    }


    public void setHead(MyString head) {
        this.head = head;
    }

    public static void main(String[] args) {
        
        MyString myString = new MyString("apple");
        StringJM stringJm = new StringJM();
        stringJm.setHead(myString);

        System.out.println(stringJm.concat("abc123"));
        System.out.println(stringJm.length());
        System.out.println(stringJm.equals("appleabc123"));
        System.out.println(stringJm.print(stringJm.subString(1)));
        System.out.println(stringJm.subString(1, 3));
        System.out.println(stringJm.charAt(1));
        System.out.println(stringJm.indexOf('b'));
        System.out.println(stringJm.toUpperCase());

        MyString num = new MyString("123");
        System.out.println(stringJm.parseInt(num));
    }

    
}
