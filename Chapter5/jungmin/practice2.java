package Bolzano.Chapter5.jungmin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice2 {
    public static StringBuilder triangleType(StringBuilder sb, int first, int second, int third) {
        int count = 0;
        if(first == second) {
            count++;
            if(first == third) {
                count++;
            }
        }
        else {
            if(second == third) {
                count++;
            }
        }
        
        if(count == 0) {
            sb.append("irregular");
        }
        else if(count == 1) {
            sb.append("symmetric");
        }
        else sb.append("regular");

        return sb;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int first, second, third;

        first = Integer.parseInt(br.readLine());
        second = Integer.parseInt(br.readLine());
        third = Integer.parseInt(br.readLine());

        System.out.println(triangleType(sb, first, second, third));
    }
}
