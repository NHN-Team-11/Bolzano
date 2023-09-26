package Chapter8.이중민;

import java.io.IOException;

public class MatrixTest {
    public static void main(String[] args) throws IOException{
        
        Exercise7 e = new Exercise7("Account.txt");
        System.out.println(e.getAccounts().size());
        System.out.println(e.getAccounts().get(0).getBalance());
        System.out.println(e.getAccounts().get(0).toString());
        e.printNegative();
        e.interests(10.0);
        System.out.println(e.getAccounts().get(0).getBalance());
        System.out.println(e.getAccounts().get(0).toString());

    }
}

