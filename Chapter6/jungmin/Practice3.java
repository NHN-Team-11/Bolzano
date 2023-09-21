package Bolzano.Chapter6.jungmin;

public class Practice3 {
    public static int factorial(int n) {
        if(n < 0) {
            throw new IllegalArgumentException("n이 0보다 작아서는 안됩니다.");
        }
        int result = 1;
        while(n != 0) {
            result *= n;
            n--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
