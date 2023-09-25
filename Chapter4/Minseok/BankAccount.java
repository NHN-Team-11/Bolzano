package Chapter4.Minseok;

public class BankAccount {
    private String name, surname;
    private double balance;

    public BankAccount(String n, String s, double balance) {
        this.name = n;
        this.surname = s;
        this.balance = balance;
    }

    public void deposit(double val) {
        balance = balance + val;
    }

    public void withdraw(double val) {
        balance = balance - val;
    }

    @Override
    public String toString() {
        return "{Owner =" + name + " " + surname + "Balance: Euro " + balance + "}";
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getBalance() {
        return balance;
    }

}
