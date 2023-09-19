package Bolzano.Chapter5.jungmin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice5 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int discriminant =  (int)Math.pow(b, 2) + (-4 * a * c);
        int result = 0;
        if(discriminant == 0) {
            result = (-1 * b) / (2 * a);
            sb.append(result);
        }
        else if(discriminant > 0) {
            sb.append(((-1 * b) + (int)Math.sqrt(discriminant))/(2*a)).append(" ").append((((-1 * b) - (int)Math.sqrt(discriminant))/(2*a)));
        }
        else {
            String first = String.valueOf(-1 * b);
            String second = String.valueOf((int)Math.sqrt(Math.abs(discriminant))) + "i";
            sb.append(first + " + " + second + " " + first + " - " + second);
        }

        System.out.println(sb);
    }
}
