import java.util.Scanner;

public class GuessingGame2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("게임을 합시다. 1과 100 사이의 숫자를");
        System.out.println("내가 고르고, 당신이 이를 추측해보세요.");
        int playAgain;
        do {
            playGame(); // 하나의 게임을 하는 서브루틴을 호출
            System.out.print("다시 게임을 하겠습니까?");
            playAgain = scanner.nextInt();
        } while (playAgain > 0);
        System.out.println("게임을 해주셔서 감사합니다. 안녕히.");
    } // main() 종료

    static void playGame() {
        int computersNumber; // 컴퓨터에 의해 선택된 무작위 숫자.
        int usersGuess; // 사용자가 추측으로 입력한 숫자.
        int guessCount; // 사용자가 한 추측의 횟수.
        Scanner scanner = new Scanner(System.in);
        computersNumber = (int) (100 * Math.random()) + 1;
        // computersNumber에 할당된 값은
        // 무작위로 선택된 1과 100 사이의 정수.
        guessCount = 0;
        System.out.println();
        System.out.print("첫 번째 추측은 무엇입니까? ");
        while (true) {
            usersGuess = scanner.nextInt(); // 사용자의 추측을 얻음.
            guessCount++;
            if (usersGuess == computersNumber) {
                System.out.println("다음 " + guessCount
                        + " 번의 추측으로 맞추었네요! 나의 숫자는 " + computersNumber);
                break; // 게임이 종료됨; 사용자가 승리함.
            }
            if (guessCount == 6) {
                System.out.println("6번의 추측으로 숫자를 얻지 못했군요.");
                System.out.println("게임에서 졌습니다. 나의 숫자는 " + computersNumber);
                break; // 게임이 종료됨; 사용자가 패배함.
            }
            // 이 시점에 도달한 경우 게임은 계속됨.
            // 추측이 너무 높다거나 낮다는 점을 사용자에게 알림.
            if (usersGuess < computersNumber)
                System.out.print("이는 너무 낮습니다. 다시 시도하세요: ");
            else if (usersGuess > computersNumber)
                System.out.print("이는 너무 높습니다. 다시 시도하세요: ");
        }
        System.out.println();
    } // playGame() 종료

} // 클래스 GuessingGame 종료