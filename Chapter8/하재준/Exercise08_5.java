import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exercise08_5 {
    static String maxMark(String filename) throws IOException {
        InputStream is = new FileInputStream(filename);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String[] result = new String[2];

        String s = br.readLine();
        int max = 0;
        while (s != null) {
            int sum = 0;
            int num = 0;
            int avg = 0;
            String name = "";
            StringTokenizer st = new StringTokenizer(s);
            name = st.nextToken();
            while (st.hasMoreTokens()) {
                sum += Integer.parseInt(st.nextToken());
                num++;
            }
            avg = (sum / num);
            if (avg > max) {
                max = avg;
                result[0] = name;
                result[1] = String.valueOf(avg);
            }

            s = br.readLine();
        }
        br.close();

        return result[0];
    }

    public static void main(String[] args) throws IOException {
        System.out.println(maxMark("highestEverage.txt"));

    }
}
