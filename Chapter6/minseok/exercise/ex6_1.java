package Chapter6.minseok.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex6_1 {

    public static int min(int i, int j) {
        if (i > j) {
            return j;
        } else {
            return i;
        }
    }

    public static int getmin(int... arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = min(min, arr[i]);
        }
        return min;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] values = new int[10];
        for (int i = 0; i < values.length; i++) {
            values[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(ex6_1.getmin(values));
    }
}
