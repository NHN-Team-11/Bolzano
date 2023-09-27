package Chapter9.이중민;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exercise7 {
    public static boolean fileExist(String fileName) throws IOException{
        File file = new File(fileName);
        if(!file.exists()) {
            throw new FileNotFoundException("파일을 찾을 수가 없습니다.");
        }
        return true;
    }

    public static boolean isInt(String str){
        try {
            Integer.parseInt(str);
        } 
        catch (NumberFormatException e) {
            System.out.println("인트형으로 변환이 불가능 합니다.");
            return false;
        }
        return true;
    }

    public static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
        } catch (NumberFormatException e) {
            System.out.println("double형으로 변환이 불가능 합니다.");
            return false;
        }
        return true;
    }   

    public static void main(String[] args) throws IOException{
        System.out.println(isInt("1"));
        System.out.println(isDouble("1.0"));
        System.out.println(fileExist("test3.txt"));
    }
}
