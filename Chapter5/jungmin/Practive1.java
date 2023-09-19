package Bolzano.Chapter5.jungmin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practive1 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double g = Double.parseDouble(br.readLine());    

        if(g > 40) {
            sb.append("extra strong liquor");
        }
        else if(20 < g && g <= 40) {
            sb.append("strong liquor");
        }
        else if(15 < g && g <= 20) {
            sb.append("liquor");
        }
        else if(12 < g && g <= 15) {
            sb.append("strong vine");
        }
        else if(10.5 < g && g <= 12) {
            sb.append("normal vine");
        }
        else {
            sb.append("light vine");
        }

        System.out.println(sb);
        
    }
}