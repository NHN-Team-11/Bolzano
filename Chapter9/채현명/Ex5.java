package Chapter9.채현명;

import java.io.*;

public class Ex5 {

    private String fileName;

    public Ex5(String fileName) {
        this.fileName = fileName;
    }

    public int countLines() throws IOException {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            int lineCount = 0;

            while (br.readLine() != null) {
                lineCount++;
            }
            return lineCount;
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFound Exception!");
        }
        return 0;
    }

    public void write(OutputStream os) throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            PrintWriter printWriter = new PrintWriter(os);
            printWriter.write(bufferedReader.readLine());
            printWriter.close();
        } catch (IOException e) {
            System.out.println("IOE Exception!");
        }
    }

    public void print() throws IOException {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("IOE Exception!");
        }
    }

    public void copy(String newFileName) throws IOException {
        try {
            FileReader fReader = new FileReader(fileName);
            FileWriter fileWriter = new FileWriter(newFileName);

            int charRead;

            while ((charRead = fReader.read()) != -1) {
                fileWriter.write(charRead);
            }
        } catch (NumberFormatException e) {
            System.out.println("NumberFormat Exception!");
        }
    }

    public void delete() {
        File file = new File(fileName);
        file.delete();
        System.out.println("파일이 삭제되었습니다.");
    }

    public static void main(String[] args) throws IOException {
        Ex5 file = new Ex5("test.txt");
        file.print();
        file.copy("NewTest.txt");
        file.delete();
    }

}
