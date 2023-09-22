public class Exercise06_1 {
    public static int smallest(int... numbers) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        System.out.println(smallest(52, -32, 10, 5, 6, 2, 9, -3, -6, 52));
    }
}
