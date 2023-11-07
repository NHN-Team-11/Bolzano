package Step2.Chapter4.minseok;

public class Exercise5 {

    public static final ArraysProcessor max = array -> {
        double max = array[0];
        for (double i = 0; i < array.length; i++) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    };

    public static final ArraysProcessor min = array -> {
        double min = array[0];

        for (double d : array) {
            if (d < min) {
                min = d;
            }
        }
        return min;
    };

    public static final ArraysProcessor sum = array -> {
        double sum = array[0];

        for (double d : array) {
            sum += d;
        }
        return sum;
    };

    public static final ArraysProcessor average = array -> {
        double average = array[0];
        for (double d : array) {
            average += d;
        }
        return average / array.length;
    };

    public static ArraysProcessor counter(double value) {
        return array -> {
            int count = 0;
            for (double d : array) {
                if (d == value) {
                    count++;
                }
            }
            return count;

        };

    }

    public static void main(String[] args) {
        double[] numbers = { 1.5, 2.5, 3.5, 2.5, 4.5, 5.5 };

        System.out.println("Max Value: " + max.apply(numbers));
        System.out.println("Min Value: " + min.apply(numbers));
        System.out.println("Sum: " + sum.apply(numbers));
        System.out.println("Average: " + average.apply(numbers));

        ArraysProcessor counter = counter(2.5);
        System.out.println("Count of " + 2.5 + ": " + counter.apply(numbers));
    }

}
