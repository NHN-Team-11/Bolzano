package exercise4;

import java.util.Random;

public class ex3 {
    public static int diceSimulator(int input) {
        Random random = new Random();
        int result = 0;
        int sankeCount = 0;

        while (input != result) {
            int first = random.nextInt(6) + 1;
            int second = random.nextInt(6) + 1;
            result = first + second;
            sankeCount++;

            System.out.println("주사위 1 :" + first + "  주사위 2 : " + second + "  합계 : " + result);
        }
        return sankeCount;
    }

    public static void main(String[] args) {
        try {
            int goalNumber = 2;
            int snakeRound = diceSimulator(goalNumber);
            System.out.println("뱀눈 찾으려면 " + snakeRound + "번 필요 합니다.");
        } catch (IllegalArgumentException e) {
            System.out.println("유효하지 않은 숫자 입니다.");
        }
    }
}
