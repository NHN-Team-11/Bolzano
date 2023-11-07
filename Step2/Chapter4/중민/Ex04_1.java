package Step2.Chapter4.중민;

import java.util.Arrays;

public class Ex04_1 {
    public static void main(String[] args) {
        printCapitalized("Now is the time to act!");
    }

    public static void printCapitalized(String str) {
        String[] result = str.split("");
        char[] ch = str.toCharArray();
        String answer = "";
        for (int i = 0; i < result.length; i++) {
            if(result[i].equals(" ")) {
                result[i + 1] = result[i + 1].toUpperCase();
//                System.out.println(result[i + 1]);
            }
//            answer += result[i];
        }
//        System.out.println(answer);

        for (int i = 0; i < ch.length; i++) {
            if(ch[i] == ' ') {
                ch[i + 1] = Character.toUpperCase(ch[i + 1]);
            }
            answer += ch[i];
        }

        Arrays.stream(result).forEach(System.out::print);
        System.out.println();
        System.out.println(answer);
    }
}
