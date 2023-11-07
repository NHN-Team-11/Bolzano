package exercise4;


import java.util.Random;
import java.util.Scanner;

public class ex8 {

    static int[] array1 = new int[10];
    static int[] array2 = new int[10];
    static int[] array3 = new int[10];

    public static void quizGenerator() {
        Random random = new Random();
        int count = 0;

        for (int i = 0; i < 10; i++) {
            array1[i] = random.nextInt(50) + 1;
            array2[i] = random.nextInt(50) + 1;
            count++;
            System.out.println(count +" 문제 : " + array1[i] + " + " + array2[i] + " = ?");

        }
    }

    public static void quizManage() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.printf(i+1 + "번 문제에 대한 답을 입력해주세요 : ");
            array3[i] = scanner.nextInt();

        }
    }

    public static void quizCheck() {
        int goalPoint = 0;
        for (int i = 0; i < 10; i++) {
            int sum = array1[i] + array2[i];

            if (sum == array3[i]) {
                System.out.println( i+1 +" 번 정답입니다.");
                goalPoint+=10;
            } else {
                System.out.println(i+1 + " 번 틀렸습니다.");
            }
        }
        System.out.println("당신의 최종 점수는 : " + goalPoint);
    }

    public static void main(String[] args) {
        quizGenerator();
        quizManage();
        quizCheck();
    }


}
