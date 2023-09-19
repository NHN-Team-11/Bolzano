import java.util.Scanner;

public class Exercise05_1 {

    public static String alcoholTest(double g) {
        if (g > 40) {
            return "extra strong liquor";
        } else if (g > 20 && g <= 40) {
            return "strong liquor";
        } else if (g > 15 && g <= 20) {
            return "liquor";
        } else if (g > 12 && g <= 15) {
            return "strong vine";
        } else if (g > 10.5 && g <= 12) {
            return "normal vine";
        }
        return "light vine";
    }

    public static void main(String[] args) {
        System.out.print("알코올 도수를 입력하세용 : ");
        Scanner sc = new Scanner(System.in);
        double g = sc.nextDouble();
        System.out.println(alcoholTest(g));
    }
}