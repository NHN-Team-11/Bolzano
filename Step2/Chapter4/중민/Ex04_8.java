package Step2.Chapter4.중민;

import java.util.Scanner;

public class Ex04_8 {
    static int total;
    static int[][] arr = new int[10][3];
    public static void main(String[] args) {

        quiz();
        quizManagement();
        total();
    }

    public static void quiz() {
        int index = 0;
        while (index < 10) {
            int first = (int) (Math.random() * 100) + 1;
            arr[index][0] = first;
            int second = (int) (Math.random() * 100) + 1;
            arr[index][1] = second;
            System.out.println("#" + (index + 1) + ". " + first + " + " + second + "의 답은?");

            index++;
        }
    }

    public static void quizManagement() {
        Scanner sc = new Scanner(System.in);
        int index = 0;
        while(index < 10) {
            System.out.print((index + 1) + "정답을 쓰시오 : ");
            arr[index][2] = sc.nextInt();
            index++;
        }
    }

    public static void total() {
        int index = 0;
        while (index < 10) {
            System.out.println((index + 1) + ". " + arr[index][0] + " + " + arr[index][1] + " = " + arr[index][2]);

            if(arr[index][0] + arr[index][1] != arr[index][2])
                System.out.println("틀렸습니다. 정답은 " + (arr[index][0] + arr[index][1]));
            else {
                System.out.println("정답입니다.");
                total += 10;
            }
            index++;
        }

        System.out.println("총 점수는 " + total);
    }

}
