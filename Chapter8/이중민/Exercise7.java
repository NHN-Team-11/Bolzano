package Chapter8.이중민;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Exercise7 {
    private String fileName;
    private String name;
    private String surName;
    private double balance;
    private List<Exercise7> accounts;
    

    public List<Exercise7> getAccounts() {
        return accounts;
    }

    public Exercise7(String name, String surName, double balance) {
        this.name = name;
        this.surName = surName;
        this.balance = balance;
    }

    public Exercise7(String fileName) throws IOException {
        this.fileName = fileName;

        accounts = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line = null;

        while((line = br.readLine()) != null) {
            String[] arr = line.split(" ");
            accounts.add(new Exercise7(arr[0], arr[1], Double.parseDouble(arr[2])));
        }
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public double getBalance() {
        return balance;
    }
    
    @Override
    public String toString() {
        return "Exercise7 [name=" + name + ", surName=" + surName + ", balance=" + balance + "]";
    }

    public void saveAccountsToFile() throws IOException{
        PrintWriter printWriter = new PrintWriter(new FileWriter(this.fileName));
        for (int i = 0; i < accounts.size(); i++) {
            printWriter.print(accounts.get(i).name + " ");
            printWriter.print(accounts.get(i).surName + " ");
            printWriter.println(accounts.get(i).balance);
        }
        printWriter.close();
    }

    public void interests(double rate) throws IOException {
        for (int i = 0; i < accounts.size(); i++) {
            accounts.get(i).balance += accounts.get(i).balance * rate/100.0;
        }
        saveAccountsToFile();
        
    }

    public void printNegative() {
        for (int i = 0; i < accounts.size(); i++) {
            if(accounts.get(i).balance < 0) {
                System.out.println(accounts.get(i).toString());
            }
        }
    }
    
    

    public static void main(String[] args) throws IOException {
        Exercise7 e = new Exercise7("Account.txt");
        System.out.println(e.toString());
        System.out.println(e.accounts.size());
        System.out.println(e.getBalance());
        e.printNegative();
        e.interests(10.0);
        System.out.println(e.accounts.get(0).balance);
    }


    


    
}