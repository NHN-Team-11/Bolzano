package Chapter10.Minseok;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise1 {

    private static int count = 0;

    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("0보다 작으면 안됩니다.");
        }
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return n + fibonacci(n - 1);

    }

    // Exercise2
    public static int countFibonacci(int n) {
        count++;
        if (n < 0) {
            throw new IllegalArgumentException("0보다 작으면 안됩니다.");
        }
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return n + countFibonacci(n - 1);

    }

    // Exercise3

    public static int akermann(int n, int m) {
        if (m == 0) {
            return n + 1;
        } else if (n == 0) {
            return akermann(m - 1, 1);
        }
        return akermann(m - 1, akermann(m, n - 1));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        System.out.println(fibonacci(10));
        System.out.println(countFibonacci(10));
        System.out.println(count);
        System.out.println(gcd(10, 0));
        System.out.println(sequence(br));
    }

    // Exercise4
    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }

    public static boolean prime(int x, int y) {
        if ((x == 1) && (y == 1)) {
            return true;
        } else if (x == y) {
            return false;
        } else if (x < y) {
            return prime(x, y - x);
        }
        return prime(x - y, y);
    }

    public static int rest(int x, int y) {
        if (x < 0) {
            return rest(x + y, y);
        } else if (x < y) {
            return x;
        }
        return rest(x - y, y);
    }

    // Exercise5
    public static int sequence(BufferedReader br) throws IOException {
        String line = br.readLine();
        if (line == null) {
            return 0;
        }
        int linecount = countStr(line);
        int filecount = sequence(br);

        return linecount + filecount;
    }

    public static int countStr(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }
}
