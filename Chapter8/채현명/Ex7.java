package Chapter8.채현명;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.jcp.xml.dsig.internal.dom.DOMDigestMethod;

public class Ex7 {
    private String fileName;

    public Ex7(String fileName) {
        this.fileName = fileName;
    }

    public void interest(double rate) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        StringBuilder sb = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null) {
            String name = line;
            String surname = br.readLine();
            double balance = Double.parseDouble(br.readLine());

            balance *= (1 + rate / 100.0);
            sb.append(name).append("\n");
            sb.append(surname).append("\n");
            sb.append(balance).append("\n");
        }
        br.close();

        FileWriter fw = new FileWriter(fileName);
        fw.write(sb.toString());
        fw.close();
    }

    public void printNegative() throws NumberFormatException, IOException {

        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        boolean hasNegative = false;

        while ((line = reader.readLine()) != null) {
            String name = line;
            String surname = reader.readLine();
            double balance = Double.parseDouble(reader.readLine());

            if (balance < 0) {
                System.out.println("Name: " + name);
                System.out.println("Surname: " + surname);
                System.out.println("Balance: " + balance);
                System.out.println();
                hasNegative = true;
            }
        }

        reader.close();
    }

    public static void main(String[] args) throws IOException {
        Ex7 ex7 = new Ex7("Account.txt");
        ex7.interest(5.0);

        ex7.printNegative();
    }

}
