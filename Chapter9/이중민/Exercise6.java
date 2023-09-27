package Chapter9.이중민;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercise6 {
    public static void main(String[] args) throws IOException {
        
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))){
            String line = null;
            while((line = br.readLine()) != null) {
                if(line.length() > 80) {
                    throw new ExceptionLineTooLong();
                }
                System.out.println(line);  
            }
        } catch (FileNotFoundException f) {
            System.out.println("file not found");
        } catch (ExceptionLineTooLong e) {
            e.getMessage();
        }
        
    }
}
