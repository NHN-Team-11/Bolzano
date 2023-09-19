import java.util.Scanner;

public class switchMonth {
    public static void main(String[] args) {
        int month, daysOfMonth;

        Scanner sc = new Scanner(System.in);
        month = sc.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysOfMonth = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                daysOfMonth = 30;
                break;
            case 2:
                daysOfMonth = 28;
                break;

            default:
                daysOfMonth = 0;
                System.out.println("Month is not valid");
        }
        System.out.println("Days: " + daysOfMonth);
    }
}
