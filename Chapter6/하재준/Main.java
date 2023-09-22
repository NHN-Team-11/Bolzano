import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Main {
    public static String encode(String s, int d) {
        String resStr;
        char c;
        int ci;

        resStr = "";
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            ci = (int) c;
            ci += d;
            c = (char) ci;
            resStr += c;
        }
        return resStr;
    }

    public static int readPositiveInteger() {
        int i;
        do {
            i = Integer.parseInt(JOptionPane.showInputDialog("Input a positive integer"));
        } while (i <= 0);
        return i;
    }

    public static int gcd(int x, int y) {
        while (x != y) {
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;
            }
        }
        return x;
    }

    public static int subsequence(String s) {
        char bit;
        int cont = 0;
        int maxlen = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            bit = s.charAt(i);
            if (bit == '0') {
                cont++;
                if (cont > maxlen) {
                    maxlen = cont;
                }
            } else {
                cont = 0;
            }

        }
        return maxlen;
    }

    public static int power(int base, int exponent) {
        int result = 1;
        int multiplicand, multiplicator, product;
        while (exponent > 0) {
            exponent--;
            // result = result * base
            multiplicand = result;
            multiplicator = base;
            product = 0;
            while (multiplicator > 0) {
                multiplicator--;
                product = product + multiplicand;
            }
            result = product;
        }
        return result;
    }

    public static void main(String[] args) {
        // String s;
        // double r;
        // double max;
        // boolean found;

        // found = false;
        // max = -Double.MAX_VALUE;

        // s = JOptionPane.showInputDialog("Input a real");
        // while (s != null) {
        // r = Double.parseDouble(s);
        // found = true;
        // if (r > max)
        // max = r;
        // s = JOptionPane.showInputDialog("Input a real");
        // }

        // if (found) {
        // System.out.println("Max = " + max);
        // } else {
        // System.out.println("empty set of values");
        // }
        // String a = "hello";
        // System.out.println(encode(a, 1));
        // int i = readPositiveInteger();
        // System.out.println(i);
        // int gcd = gcd(16, 4);
        // System.out.println(gcd);
        // String s = "0010000111100";
        // System.out.println(subsequence(s));
        // int p = power(15, 8);
        // System.out.println(p);
        StringTokenizer st = new StringTokenizer("I    am   a   \n student");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}