package Chapter3.채현명;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MessageClient {
    public static void main(String[] args) throws IOException {

        String sendNumber = "01092059624";

        MessageText messageText = new MessageText("ily", "I love yout darling");

        System.out.println("Input Reciver Phone number : ");
        String reciveNumber = readPhoneNumber();

        Message message = new Message(messageText, reciveNumber, sendNumber);

        message.printMessage();
    }

    public static String readPhoneNumber() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }
}
