public class Ex4_4 {
    final static int MAX_ROLL = 10000;

    static double diceRollCount(int diceSum) {
        if (diceSum < 2 || diceSum > 12) {
            throw new IllegalArgumentException("2부터 12 사이의 숫자를 입력해주세요.");
        }
        int count = 0;
        int sum = 0;
        while (count <= MAX_ROLL) {
            sum += Ex4_3.diceSimulation(diceSum);
            count++;
        }
        return (double) sum / MAX_ROLL;
    }

    public static void main(String[] args) {
        System.out.println("주사위의 총합          평균 굴림 횟수");
        System.out.println("-------------          -------------");
        System.out.println("      2                   " + diceRollCount(2));
        System.out.println("      3                   " + diceRollCount(3));

    }
}
