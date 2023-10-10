import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Main {
    public static int sum(int x, int y) {
        if (y == 0)
            return x;
        else
            return 1 + sum(x, y - 1);
    }

    public static int product(int x, int y) {
        if (y == 0)
            return 0;
        else
            return sum(x, product(x, y - 1));
    }

    public static int sum(BufferedReader br) throws IOException {
        String s = br.readLine();
        if (s == null) {
            return 0;
        } else {
            return Integer.parseInt(s) + sum(br);
        }
    }

    public static boolean present(int val, BufferedReader br) throws IOException {
        String s = br.readLine();
        if (s == null)
            return false;
        else
            return (Integer.parseInt(s) == val) || present(val, br);
    }

    public static int B(int pb) {
        /* b0 */ System.out.println("In B. Parameter pb = " + pb);
        /* b1 */ return pb + 1;
    }

    public static int A(int pa) {
        /* a0 */ System.out.println("In A. Parameter pa = " + pa);
        /* a1 */ System.out.println("Call of B(" + (pa * 2) + ").");
        /* a2 */ int va = B(pa * 2);
        /* a3 */ System.out.println("Again in A. va = " + va);
        /* a4 */ return va + pa;
    }

    public static void recursive(int i) {
        System.out.print("In recursive(" + i + ")");
        if (i == 0)
            System.out.println(" - Finished");
        else {
            System.out.println(" - Activation of recursive("
                    + (i - 1) + ")");
            recursive(i - 1);
            System.out.print("Again in recursive(" + i + ")");
            System.out.println(" - Finished");
        }
        return;
    }

    public static boolean palindrome(String s) {
        if (s.length() <= 1)
            return true;
        else
            return (s.charAt(0) == s.charAt(s.length() - 1)) &&
                    palindrome(s.substring(1, s.length() - 1));
    }

    public static boolean symmetric(BufferedReader br) throws NumberFormatException, IOException {
        int n = Integer.parseInt(br.readLine()); // 첫 번째 정수 읽기
        if (n == 0)
            return true; // 시퀀스의 중간에 있습니다.
        else {
            // 중간의 시퀀스를 읽고 대칭인지 확인합니다.
            boolean sim = symmetric(br);
            int m = Integer.parseInt(br.readLine()); // 마지막 정수 읽기
            return (n == m) && sim;
        }
    }

    public static void main(String[] args) throws NumberFormatException, FileNotFoundException, IOException {
        // int j;
        // System.out.print("In main");
        // j = Integer.parseInt(JOptionPane.showInputDialog(
        // "Insert a non-negative integer"));
        // System.out.println(" - Activation of recursive(" + j + ")");
        // recursive(j);
        // System.out.print("Again in main");
        // System.out.println(" - Finished");
        // System.exit(0);
        // System.out.println(palindrome("itopinonavevanonipoti"));
        // String line = "itopinonavevanonipoti";
        // System.out.println(line.charAt(0));
        // System.out.println(line.charAt(line.length() - 1));
        // System.out.println(line.substring(1, line.length() - 1));
        System.out.println(symmetric(new BufferedReader(new FileReader("test.txt"))));
    }

}