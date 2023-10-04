import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class MaximumWithoutExceptions {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("data.txt")));

            int max = -1;

            String line = br.readLine();
            while (line != null) {
                int n = Integer.parseInt(line);
                if (n > max)
                    max = n;
                line = br.readLine();
            }

            if (max == -1) {
                throw new Exception("File empty or all numbers < 0");
            } else {
                System.out.println("Maximum = " + max);
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file does not exist");
        } catch (IOException e) {
            System.out.println("The file cannot be read");
        } catch (NumberFormatException e) {
            System.out.println("The file contains non numeric data");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
