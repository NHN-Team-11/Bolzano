package Chapter5.채현명;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise6 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input question");
        String inputQuestion = br.readLine().toLowerCase();

        StringBuilder sb = new StringBuilder();

        boolean isMaybe = "aeiou".indexOf(inputQuestion.charAt(0)) != -1;
        if (isMaybe) {
            sb.append("Maybe");
        }

        char lastWord = inputQuestion.charAt(inputQuestion.length() - 1);

        boolean isAiu = "aiu".indexOf(lastWord) != -1;
        boolean isEo = "eo".indexOf(lastWord) != -1;
        boolean notInWord = !"aeiou".contains(String.valueOf(lastWord));

        if (isAiu) {
            sb.append("YES");
        } else if (isEo) {
            sb.append("No");
        } else if (notInWord) {
            sb.append("Don't Know");
        }

        System.out.println(sb.toString());

    }

}
