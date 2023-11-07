package Step2.Chapter4.중민;

public class Ex04_4 {
    public static void main(String[] args) {
        int i = 0;
        while(i != 10000) {
            int dice1 = (int) (Math.random() * 6) + 1;
            int dice2 = (int) (Math.random() * 6) + 1;
            int sum = dice2 + dice1;
            averageRoll(sum);

            i++;
        }
    }

    private static void averageRoll(int sum) {



    }
}
