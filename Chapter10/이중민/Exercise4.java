package Chapter10.이중민;

public class Exercise4 {
    public static int gcd(int x, int y) {
        if(y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }

    public static boolean prime(int x, int y) {
        if(x == 1 || y == 1) {
            return true;
        }
        else if(x == y) {
            return false;
        }
        else if(x < y) {
            return prime(x, y - x);
        }
        else {
            return prime(x - y, y);
        }
    }

    public static int rest(int x, int y) {
        if(x < 0) {
            return rest(x + y, y);
        }
        else if(0 <= x && x < y) {
            return x;
        }
        else {
            return rest(x - y, y);
        }
    }

    public static void main(String[] args) {
        System.out.println(gcd(72, 30));
        System.out.println(prime(6, 14));
        System.out.println(rest(10, 3));
    }
}
