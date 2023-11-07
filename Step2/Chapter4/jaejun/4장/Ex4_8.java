import java.util.Scanner;

public class Ex4_8 {
    public static int[] firstNumArr;
    public static int[] secondNumArr;
    public static int[] answerArr;
    static final int GAME_COUNT = 10;

    static void createQuiz() {
        firstNumArr = new int[10];
        secondNumArr = new int[10];
        for (int i = 0; i < GAME_COUNT; i++) {
            firstNumArr[i] = (int) (Math.random() * 100 + 1);
            secondNumArr[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println("퀴즈를 만듭니다.");
    }

    static void manageQuiz() {
        Scanner sc = new Scanner(System.in);
        answerArr = new int[10];
        for (int i = 0; i < GAME_COUNT; i++) {
            System.out.print("문제 " + (i + 1) + ". " + firstNumArr[i] + " + " + secondNumArr[i] + " = ");
            answerArr[i] = sc.nextInt();
        }
    }

    static int gradeQuiz() {
        int grade = 0;
        for (int i = 0; i < GAME_COUNT; i++) {
            if (answerArr[i] == firstNumArr[i] + secondNumArr[i]) {
                grade++;
            }
        }
        return grade;
    }

    public static void main(String[] args) {
        createQuiz();
        manageQuiz();
        System.out.println("당신의 점수는 " + gradeQuiz() + "점 입니다.");
    }
}
