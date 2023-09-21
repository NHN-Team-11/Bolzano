package Chapter6.jungmin;

public class Practice9 {
    public static void pyramid(int h) {
        if(h > 9) {
            System.out.println("NO!!!!!");
            return;
        }
        for (int height = 0; height < h; height++) {
            int result = 1;
            for (int blank = 1; blank <= h - height; blank++) {
                System.out.print(" ");
            }

            for (int number = 1; number <= 2 * height + 1; number++) {
                
                if(number > height) {
                    System.out.print(result--);
                }
                else 
                    System.out.print(result++);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pyramid(5);
    }
}
