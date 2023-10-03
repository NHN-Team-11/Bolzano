package Chapter10.이중민;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise5 {
    public static int count(BufferedReader br, int cnt) throws IOException{
        String line = br.readLine();
        if(line == null) {
            return cnt;
        }
        else {
            String[] arr = line.split(",");
            for (int i = 0; i < arr.length; i++) {
                if(arr[i].equals("1")) {
                    cnt++;
                }
            }
            return count(br, cnt);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/wnd0605/Documents/GitHub/Bolzano/test.txt"));
        System.out.println(count(br, 0));
    }
}
