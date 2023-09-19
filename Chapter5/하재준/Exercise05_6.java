import java.util.Scanner;

public class Exercise05_6 {
    public static void main(String[] args) {
        System.out.print("질문을 입력해주세요 : ");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        if (line.charAt(0) == 'a' || line.charAt(0) == 'e' || line.charAt(0) == 'i' || line.charAt(0) == 'o'
                || line.charAt(0) == 'u') {
            System.out.print("MAYBE ");
        }
        if (line.charAt(line.length() - 1) == 'a' || line.charAt(line.length() - 1) == 'i'
                || line.charAt(line.length() - 1) == 'u') {
            System.out.println("YES");
        } else if (line.charAt(line.length() - 1) == 'e' || line.charAt(line.length() - 1) == 'o') {
            System.out.println("NO");
        } else {
            System.out.println("DON'T KNOW");
        }
    }
}
