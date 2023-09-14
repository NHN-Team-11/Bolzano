import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Messageclient {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sendphoneNumber = "01040692880";

        MessageText msg = new MessageText("ily", "I love yout darling");
        System.out.println("Input Reciver Phone number : ");
        String reciverphoneNumber = br.readLine();

        Message msg1 = new Message(sendphoneNumber, reciverphoneNumber, msg);

        msg1.printMessage();
    }
}
