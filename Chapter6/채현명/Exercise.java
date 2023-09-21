package Chapter6.채현명;

public class Exercise {

    public static int minValue(int first, int second) {
        if (first > second) {
            return second;
        }
        return first;
    }

    public static int getValue(int... inits) {
        int result = Integer.MAX_VALUE; //21억.......
        for (int i = 0; i < inits.length; i++) {
            result = minValue(result, inits[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getValue(20, 30, 4, 55, 68));
    }
}
