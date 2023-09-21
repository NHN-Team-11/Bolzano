package Chapter6.jungmin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice1 {

    // static int result = Integer.MAX_VALUE;

    public static int min(int i, int j) {
        if(i > j) {
            return j;
        }
        return i;
    } 

    public static int getMinInt(int... ints) {
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < ints.length; i++) {
            result = min(result, ints[i]);
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.println(getMinInt(5,4,2,3,6));
    }
}
