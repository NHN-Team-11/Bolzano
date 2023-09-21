package Chapter6.jungmin;

public class Practice10 {
    public static StringBuilder factorial(StringBuilder sb, int n) {
        if(n < 0) {
            throw new IllegalArgumentException("n이 0보다 작아서는 안됩니다.");
        }
        int result = 1;
        while(n != 0) {
            if(n != 1)
                sb.append(n).append(" * ");
            else
                sb.append(n).append(" = ");
            result *= n;
            n--;
        }
        sb.append(result);
        return sb;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(factorial(sb, 5));
    }
}

    // private static void factorial(int n) {
    // if (n <= 0) {
    // throw new IllegalArgumentException("0보다 큰 값이 와야합니다.");
    // }
    // int fac = 1;
    // for (int i = 1; i <= n; i++) {
    // fac *= i;
    // }
    // System.out.println("factorial = " + fac);
    // }