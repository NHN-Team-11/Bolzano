package exercise4;

import java.util.Arrays;

public class ex5 {
    public static final ArrayProcessor MAX = array -> Arrays.stream(array).max().getAsDouble();
    public static final ArrayProcessor MIN = array -> Arrays.stream(array).min().getAsDouble();
    public static final ArrayProcessor SUM = array -> Arrays.stream(array).sum();
    public static final ArrayProcessor AVERAGE = array -> Arrays.stream(array).average().getAsDouble();

    public static ArrayProcessor counter(double value) {
        return array -> Arrays.stream(array).
                filter(v -> v == value).
                count();
    }

    public static void main(String[] args) {
        double[] array = {1.2, 2.8, 2.5, 3.5};

        System.out.println(MAX.apply(array));
        System.out.println(MIN.apply(array));
        System.out.println(SUM.apply(array));
        System.out.println(AVERAGE.apply(array));
        System.out.println(counter(2.5));
    }

}
