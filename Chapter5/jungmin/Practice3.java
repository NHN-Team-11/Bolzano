package Bolzano.Chapter5.jungmin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int first, second, third;

        first = Integer.parseInt(br.readLine());
        second = Integer.parseInt(br.readLine());
        third = Integer.parseInt(br.readLine());

        if((first == second && first == third) && second == third) {
            sb.append("regular");
        }
        else if ((first == second || first == third) || second == third) {
            sb.append("symmetric");
        }
        else {
            sb.append("irregular");
        }

        System.out.println(sb);
    }
}
