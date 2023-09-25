package Chapter8.Minseok;

import java.util.ArrayList;
import java.util.List;

import Chapter4.Minseok.BankAccount;

public class Exercise7 {
    private String fileName;
    private List<BankAccount> account;

    public Exercise7(String filename) {
        this.fileName = filename;
        this.account = new ArrayList<>();
    }

    public void interests(double rate) {
        for (BankAccount accounts : account) {
            double balance = accounts.getBalance() * (1 + rate);
            accounts = new BankAccount(accounts.getName(), accounts.getSurname(), balance);
        }
    }

    public void printNegative() {
        for (BankAccount accounts : account) {
            if (accounts.getBalance() < 0) {
                System.out.println(account);
            }
        }
    }

    public static void main(String[] args) {
        Exercise7 ex = new Exercise7("test.txt");
        ex.interests(10);
        ex.printNegative();
    }

}
