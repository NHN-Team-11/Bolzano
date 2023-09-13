
import javax.swing.JOptionPane;

public class Initials {
    public static void main(String[] args) {
        String fn = JOptionPane.showInputDialog("Insert first name");
        String ln = JOptionPane.showInputDialog("Insert surname");
        String ifn = fn.substring(0, 1).toUpperCase();
        String iln = ln.substring(0, 1).toUpperCase();
        System.out.println("Name: " + fn + " " + ln);
        System.out.println("Initials: " + ifn + iln);
        System.exit(0);
    }

}
