package Chapter4.Minseok.exercise;

public class Account {
    // 3.1
    public static double convertLireEuro(int x) {
        double eurRate = 1320.48026;
        return x * eurRate;
    }

    // 3.2
    public static boolean sumOverflow(byte x, byte y) {

        if (x + y > 127 || x + y < -128) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(convertLireEuro(1));
        System.out.println(sumOverflow((byte) -89, (byte) -60));
        // 3.3
        System.out.println((1.0 + 2.0) / 2.0);
        System.out.println(Math.pow(10, 2));
        System.out.println(Math.max(1, 2) + Math.min(1, 2));
    }
}
