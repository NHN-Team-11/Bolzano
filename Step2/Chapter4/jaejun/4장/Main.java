public class Main {
    public static int a;

    private static void printRow(char ch, int N) {
        int i;
        for (i = 1; i < N; i++) {
            System.out.println(ch);
        }
        System.out.println();
    }

    private static void printRowsFromString(String str) {
        for (int i = 0; i < str.length(); i++) {
            printRow(str.charAt(i), 25);
        }
    }

    static void printValuesInList(int[] list) {
        System.out.print('[');
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]);
            System.out.print(',');

        }
        System.out.println(']');
    }

    static void plusone(int i) {
        i = i + 1;
    }

    static double sum(FunctionR2R f, int start, int end) {
        int result = 0;
        for (int i = start; i <= end; i++) {
            result += f.valueAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        // printRowsFromString("hello");
        // int[] arr = { 2, 5, 1, 7, 10 };
        // printValuesInList(arr);
        int i = 6;
        System.out.println(i);
        plusone(i);
        System.out.println(i);

        System.out.println(sum(x -> x * x, 1, 2));
    }
}