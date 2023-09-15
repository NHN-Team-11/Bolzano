package Chapter4.Minseok.exercise;

public class Account {
    public int bal;

    public Account(int x) {
        this.bal = x;
    }

    // 4.1
    public static double convertLireEuro(int x) {
        double eurRate = 1320.48026;
        return x * eurRate;
    }

    // 4.2
    public static boolean sumOverflow(byte x, byte y) {

        if (x + y > 127 || x + y < -128) {
            return true;
        } else {
            return false;
        }
    }

    // 4.4
    public static boolean even(long x) {
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(convertLireEuro(1));
        System.out.println(sumOverflow((byte) -89, (byte) -60));
        // 4.3
        System.out.println((1.0 + 2.0) / 2.0);
        System.out.println(Math.pow(10, 2));
        System.out.println(Math.max(1, 2) + Math.min(1, 2));

        short x = 22;
        byte y = (byte) x;
        System.out.println(y);
        // 4.5
        byte b = 0;
        short s = 0;
        int i = 0;
        long l = 0;
        float f = 0;
        double d = 0;
        char c = '0';
        boolean b1 = true;
        boolean b2 = false;

        long result = b + 10L; // -> long타입
        long result1 = (b + i) * l; // -> long타입
        float result2 = (b + i) * l + f; // -> float타입
        double result3 = s / f + Math.sin(f); // -> double타입
        boolean result4 = c == 'b'; // -> boolean타입
        float result5 = l + 1.5f; // -> float타입
        boolean result6 = i < 10; // -> boolean타입
        boolean result7 = b1 == (f >= 5.0); // -> boolean타입
        boolean result8 = b1 && !b2; // -> boolean타입

        // exercise 4.6
        // 1. s = 65L; <- 숫자가 너무 작음
        // 2. f = i + 100; <- error x
        // 3. i = 2 * b + l; <- i가 int형
        // 4. b1 = s; <- boolean 형 true, false로 비교
        // 5. b2 = s >= 57; <- error x
        // 6. c = b; <- 문자열과 숫자는 다름
        // 7. c = 'b'; <- error x

    }
}
