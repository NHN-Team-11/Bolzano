package Bolzano.Chapter5.jungmin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice6 {

    public static StringBuilder question(String line, StringBuilder sb) {
        char firstline = line.charAt(0);
        if(firstline == 'a' || firstline == 'e' || firstline == 'i' || firstline == 'o' || firstline == 'u') {
            sb.append("MAYBE").append(" ");
        }

        char lastline = line.charAt(line.length() - 1);
        if(lastline == 'a' || lastline == 'i' || lastline == 'u') {
            sb.append("YES");
        }
        else if (lastline == 'e' || lastline == 'o'){
            sb.append("NO");
        }
        else {
            sb.append("DON'T KNOW").append(" ");
        }
        return sb;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line = br.readLine();
        System.out.println(question(line, sb));
    }
}