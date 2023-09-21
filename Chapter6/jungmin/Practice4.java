package Bolzano.Chapter6.jungmin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int positiveSum = 0;
        int negativeSum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num > 0) {
               positiveSum += num;     
            }
            else {
                negativeSum += num;
            }
        }
        System.out.println(positiveSum);
        System.out.println(negativeSum);
    }    
}
