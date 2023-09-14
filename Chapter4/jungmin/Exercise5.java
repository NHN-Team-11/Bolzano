package Bolzano.Chapter4.jungmin;

public class Exercise5 {
    public static void main(String[] args) {
        //Exercise 4.5
        short x = 22;
        byte y = (byte)x;
        System.out.println(y);

        //Exercise 4.6
        byte b = 0;
        short s = 0;
        int i = 0;
        long l = 0;
        float f = 0;
        double d = 0;
        char c = '0';
        boolean b1 = true;
        boolean b2 = false;

        long result1 = b + 10L; // -> long타입으로 받아야한다.
        long result2 = (b+i)*l; // -> long타입으로 받아야한다.
        float result3 = (b+i)*l+f; // -> float타입으로 받아야한다.
        double result4 = s/f + Math.sin(f); // -> double 타입으로 받아야한다.
        boolean result5 = c == 'b'; // -> boolean타입으로 받아야한다.
        float result6 = l+1.5f; // -> float타입으로 받아야한다.
        boolean result7 = i<10; // -> boolean타입으로 받아야한다.
        boolean result8 = b1 == (f >= 5.0); // -> boolean타입으로 받아야한다.
        boolean result9 = b1 && !b2; // -> boolean타입으로 받아야한다.

        //Exercise 4.7
        // 1. s = 65L은 s의 크기가 너무 작아 오류가 난다.
        // 3. i = 2*b + l; int형이 long형을 담을 수 없어 오류가 난다.
        // 4. b1 = s 는 boolean은 true false를 비교하기 때문에 오류가 난다.
        // 6. c = b 문자열과 숫자는 다르기 때문에 오류난다.
        
        
    }
}
