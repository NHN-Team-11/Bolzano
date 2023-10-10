public class Practice4 {
    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }

    public static boolean isPrime(int x, int y) {
        if (x == 1 || y == 1) {
            return true;
        } else if (x == y) {
            return false;
        } else if (x < y) {
            return isPrime(x, y - x);
        } else if (x > y) {
            return isPrime(x - y, y);
        }
        return true;
    }

    public static int rest(int x, int y) {
        if (x < 0) {
            return rest(x + y, y);
        } else if (0 <= x && x < y) {
            return x;
        } else if (x > y) {
            return rest(x - y, y);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(gcd(10, 30));
        System.out.println(isPrime(17, 34));
        System.out.println(rest(12, 5));
    }
}
