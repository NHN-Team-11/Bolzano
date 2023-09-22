import javax.swing.JOptionPane;

public class pyramidOfStars {
    public static void main(String[] args) {
        int height;
        height = Integer.parseInt(JOptionPane.showInputDialog("Input the height"));

        for (int row = 1; row <= height; row++) {
            for (int i = 1; i <= height - row; i++)
                System.out.print(" ");
            for (int i = 1; i <= row * 2 - 1; i++)
                System.out.print("*");
            System.out.println();
        }
    }
}
