import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Exercise08_2 {
    public static Double getAverage(InputStream is) throws IOException {
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        int sum = 0;
        int cnt = 0;
        int a = Integer.parseInt(br.readLine());
        while (a != 0) {
            sum += a;
            cnt++;
            a = Integer.parseInt(br.readLine());
        }

        return sum / (double) cnt;
    }

    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        System.out.println(getAverage(is));
    }
}
