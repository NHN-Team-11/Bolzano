import javax.swing.JOptionPane;

public class Hanoi {
    private static void moveADisk(int source, int dest) {
        System.out.println("move a disk from " + source + " to " + dest);
    }

    private static void move(int n, int source, int dest, int aux) {
        if (n == 1)
            moveADisk(source, dest);
        else {
            move(n - 1, source, aux, dest);
            moveADisk(source, dest);
            move(n - 1, aux, dest, source);
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(
                JOptionPane.showInputDialog("How many disks do you want to move?"));
        System.out.println("To move " + n +
                " disks from 1 to 2 using 3 as auxiliary disk:");
        move(n, 1, 2, 3);
        System.exit(0);
    }
}