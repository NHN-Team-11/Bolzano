package Chapter6.jungmin;

public class Practice5 {

    public static double calculator(int n) {
        double pi = 4;
        int sign = 1;
        for (int i = 1; i < n; i++) {
           if(i % 2 != 0) {
            sign = -1;
           } 
           else {
            sign = 1;
           }
           pi += (double)(sign * 4) / (i * 2 + 1); 
        }
        return pi;
    }
    public static void main(String[] args) {
        System.out.println(calculator(1000000000));
    }
}
