package Chapter6.minseok.exercise;

public class ex6_10 {
    public static StringBuilder factorial(StringBuilder sb, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("0보다 작으면 안됩니다");
        }
        int result = 1;
        for (int i = n; i > 0; i--) {
            if (i == 1) {
                sb.append(i).append(" = ");
            } else {
                sb.append(i).append(" * ");
            }
            result *= i;
        }
        sb.append(result);

        return sb;

    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(factorial(sb, 5));
    }

}
