package Bolzano.Chapter6.jungmin;

public class Practice11 {
    public static boolean indicate(int n) {
        for (int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(indicate(2));
    }
}
