package exercise4;

import java.util.Random;

public class ex4 {
    // 주어진 총합을 얻기 위한 평균 굴림 횟수를 계산하는 함수
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

    public static double countingAvg(int input, int maxRound) {

        int totalRolls = 0;

        for (int i = 0; i < maxRound; i++) {
            int count = diceSimulator(input);
            totalRolls += count;
        }

        return (double) totalRolls / maxRound;
    }


    public static void main(String[] args) {
        int diceSum = 2;
        int diceSum2 = 3;
        double averageCounting = countingAvg(diceSum, 10000);
        double averageCounting2 = countingAvg(diceSum2, 10000);

        System.out.println("주사위의 총합 \t 평균 굴림 횟수");
        System.out.println("---------- \t ------------");
        System.out.println("    "+diceSum + "          " + averageCounting);
        System.out.println("    "+diceSum2 + "          " + averageCounting2);

    }

}
