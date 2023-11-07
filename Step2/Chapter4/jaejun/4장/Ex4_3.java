public class Ex4_3 {
    static int diceSimulation(int diceSum) {
        if (diceSum < 2 || diceSum > 12) {
            throw new IllegalArgumentException("2부터 12 사이의 숫자를 입력해주세요.");
        }
        int sum;
        int dice1;
        int dice2;
        int count = 0;
        do {
            dice1 = (int) (Math.random() * 6 + 1);
            dice2 = (int) (Math.random() * 6 + 1);
            sum = dice1 + dice2;
            count++;
        } while (sum != diceSum);

        return count;
    }

    public static void main(String[] args) {
        System.out.println("뱀눈 (주사위 총합이 2일 경우)이 나오려면 던져야 하는 주사위 수 : " + diceSimulation(1));
    }
}
