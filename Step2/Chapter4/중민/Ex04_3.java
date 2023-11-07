package Step2.Chapter4.중민;

public class Ex04_3 {
    public static void main(String[] args) throws IllegalAccessException {

        System.out.println("주사위의 총합      평균 굴림 횟수");
        System.out.println("-------------     --------------");
        System.out.println("\t" + 2 + "\t\t\t\t" + averageRoll(2));
        System.out.println("\t" + 3 + "\t\t\t\t" + averageRoll(3));
        System.out.println("\t"+ 4 + "\t\t\t\t" + averageRoll(4));

    }

    public static int rollDice(int sum) throws IllegalAccessException {
        if(sum < 2 || sum > 12)
            throw new IllegalAccessException("주사위 값이 이상합니다.");

        int count = 0;
        while(true) {

            int dice1 = (int) (Math.random() * 6) + 1;
            int dice2 = (int) (Math.random() * 6) + 1;
            int diceSum = dice2 + dice1;
            count++;

            if(sum == diceSum)
                break;
        }
        return count;
    }

    private static double averageRoll(int sum) throws IllegalAccessException {
        int i = 0;
        int result = 0;
        while(i != 10000) {
            int count = rollDice(sum);
            result += count;
            i++;
        }
        return (double) result / 10000;
    }

}
