package Chapter6.채현명;

public class Ex2 {

    public static void even(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("invalid number");
        }

        int count = 0;
        int num = 2;

        while (count < number) {
            System.out.print(num + " ");
            count++;
            num += 2;
        }
    }

    public static int[] Even(int num) {
        int[] array = new int[num];

        for (int i = 0; i <= num; i++) {
            if (num % 2 == 0) {
                array[i] = num;
            }
        }
        return array;
    }

    public static StringBuilder evnumber(StringBuilder sb, int n) {
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sb.append(i).append(" ");
            }
        }
        return sb;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(evnumber(sb, 10));
    }
}
