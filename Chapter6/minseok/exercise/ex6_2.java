package Chapter6.minseok.exercise;

public class ex6_2 {

    public static void even(int n) {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
    }

    public static StringBuilder even2(StringBuilder sb, int n) {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sb.append(i).append(" ");
            }
        }
        return sb;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        ex6_2.even(10);
        System.out.println(even2(sb, 10));
    }

}
