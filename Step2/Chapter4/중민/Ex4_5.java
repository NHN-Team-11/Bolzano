package Step2.Chapter4.중민;

public class Ex4_5 {
    public static final ArrayProcessor max = array -> {
        double max = 0;
        for (int i = 0; i < array.length; i++) {
            if(max < array[i])
                max = array[i];
        }
        return max;
    };

    public static final ArrayProcessor min = array -> {
        double min = Double.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(min > array[i])
                min = array[i];
        }
        return min;
    };

    public static final ArrayProcessor sum = array -> {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    };

    public static final ArrayProcessor avg = array -> {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    };

    public static void main(String[] args) {
        System.out.println(avg.apply(new double[] {1, 2, 3, 4}));
        sum.apply(new double[] {1, 2, 3, 4});
        min.apply(new double[] {1, 2, 3, 4});
        max.apply(new double[] {1, 2, 3, 4});
        ArrayProcessor a = counter(2);
        System.out.println(a.apply(new double[] {1, 2, 3, 4}));

    }
    public static ArrayProcessor counter(double value) {
        return x -> {
            int count = 0;
            for (int i = 0; i < x.length; i++) {
                if(x[i] == value)
                    count++;
            }
            return count;
        };
    }


}
