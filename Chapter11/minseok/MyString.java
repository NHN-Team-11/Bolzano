package Chapter11.minseok;

import java.util.Arrays;

public class MyString {

    private char[] chars;

    public MyString(String str) {
        this.chars = str.toCharArray();
    }

    public String concat(MyString ms) {
        char[] current = new char[chars.length + ms.chars.length];
        int index = 0;

        // for (int i = 0; i < chars.length; i++) {
        // current[i] = chars[i];
        // }

        // for (int i = 0; i < ms.chars.length; i++) {
        // current[chars.length + i] = ms.chars[i];
        // }

        for (char c : chars) {
            current[index++] = c;
        }

        for (char c : ms.chars) {
            current[index++] = c;
        }

        return new String(current);

    }

    public boolean equals(MyString ms) {
        if (chars.length != ms.chars.length) {
            return false;
        }

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ms.chars[i]) {
                return false;
            }
        }
        return true;
    }

    public MyString substring(int start, int end) {
        if (start < 0 || end > chars.length || start > end) {
            throw new IllegalArgumentException("Error");
        }
        char[] current = new char[end - start];
        int index = 0;

        for (int i = start; i < end; i++) {
            current[index++] = chars[i];
        }
        return new MyString(new String(current));
    }

    public int length() {
        return chars.length;
    }

    public char charAt(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Error");
        }
        return chars[index];
    }

    public int indexOf(char c) {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                return i;
            }
        }
        return -1;
    }

    public MyString toUpperCase() {
        char[] current = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            current[i] = Character.toUpperCase(chars[i]);
        }
        return new MyString(new String(current));
    }

    public int parseInt(MyString ms) {
        char[] current = ms.toString().toCharArray();
        int result = 0;

        for (int i = 0; i < current.length; i++) {
            char c = current[i];
            if (c >= '0' && c <= '9') {
                int digit = c - '0';
                result = result * 10 + digit;
            } else {
                throw new NumberFormatException("존재하지 않습니다.");
            }
        }
        return result;
    }

    public int parseIntRecursive(int index) {
        char c = chars[index];
        if (c > '0' && c < '9') {
            int digit = c - '0';
            return digit + parseIntRecursive(index + 1) * 10;
        } else {
            throw new NumberFormatException("숫자가 아닙니다.");
        }
    }

    @Override
    public String toString() {
        return new String(chars);
    }

}
