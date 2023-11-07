public class Ex4_5 {
    static final ArrayProcessor maxNum = (x) -> {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
            }
        }
        return max;
    };
    static final ArrayProcessor minNum = (x) -> {
        double min = Double.MAX_VALUE;
        for (int i = 0; i < x.length; i++) {
            if (x[i] < min) {
                min = x[i];
            }
        }
        return min;

    };
    static final ArrayProcessor arrSum = (x) -> {
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum = sum + x[i];
        }
        return sum;
    };
    static final ArrayProcessor arrAvg = (x) -> {
        double sum = 0;
        double avg = 0;
        for (int i = 0; i < x.length; i++) {
            sum = sum + x[i];
        }
        return sum / x.length;
    };

    public static ArrayProcessor counter(double value) {
        ArrayProcessor ap = (x) -> {
            int count = 0;
            for (int i = 0; i < x.length; i++) {
                if (x[i] == value) {
                    count++;
                }
            }
            return count;
        };
        return ap;
    }

    public static void main(String[] args) {
        double[] arr = { 1, 6, 4, 2, 5, 3, 7, 8, 9 };
        System.out.println(maxNum.apply(arr));
        System.out.println(minNum.apply(arr));
        System.out.println(arrSum.apply(arr));
        System.out.println(arrAvg.apply(arr));
        ArrayProcessor ap = counter(5);
        System.out.println(ap.apply(arr));
    }
}
