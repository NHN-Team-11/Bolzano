package Step2.Chapter4.minseok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise8 {

    public static int[] Quiz = new int[10];
    public static int[] Solution = new int[10];

    public static void generateQuiz() throws IOException {
        int count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("문제의 숫자의 범위를 정해주세요.");
        int Range = Integer.parseInt(br.readLine());
        int index = 0;
        while (count < 10) {
            count++;
            int a = (int) (Math.random() * Range) + 1;
            int b = (int) (Math.random() * Range) + 1;

            if (a > Range && b > Range) {
                throw new IllegalArgumentException("문제의 범위에 숫자가 생성되면 안됩니다.");
            }
            System.out.println(count + "문제 " + a + " + " + b + " = ?");
            int sum = a + b;
            Quiz[index] = sum;
            index++;
        }
    }

    public static void conductQuiz() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < Solution.length; i++) {
            System.out.println(i + 1 + "번째 문제의 정답을 입력하세요 : ");
            int a = Integer.parseInt(br.readLine());
            Solution[i] = a;
        }
    }

    public static void checkQuiz() {
        int count = 0;
        for (int i = 0; i < Quiz.length; i++) {
            if (Quiz[i] == Solution[i]) {
                count++;
            }
        }
        System.out.println("점수는 " + count * 10 + "점 입니다.");

    }

    public static void main(String[] args) throws IOException {
        generateQuiz();
        conductQuiz();
        checkQuiz();
    }
}
