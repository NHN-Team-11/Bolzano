package Chapter8.채현명;

import java.io.*;

public class Ex6 {

    private String fileName;

    public Ex6(String fileName) {
        this.fileName = fileName;
    }

    public int countLines() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        int lineCount = 0;

        while (br.readLine() != null) {
            lineCount++;
        }
        return lineCount;
    }

    public void write(OutputStream os) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        PrintWriter printWriter = new PrintWriter(os);
        printWriter.write(bufferedReader.readLine());
        printWriter.close();
    }

    public void print() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }

    public void copy(String newFileName) throws IOException {
        FileReader fReader = new FileReader(fileName);
        FileWriter fileWriter = new FileWriter(newFileName);

        int charRead;

        while ((charRead = fReader.read()) != -1) {
            fileWriter.write(charRead);
        }
    }

    public void delete() {
        File file = new File(fileName);
        file.delete();
        System.out.println("파일이 삭제되었습니다.");
    }

    public static void main(String[] args) throws IOException {
        Ex6 file = new Ex6("test.txt");
        file.print();
        file.copy("NewTest.txt");
        file.delete();
    }

}
