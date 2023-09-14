package Chapter4.Minseok;

public class BankAccount {
    private String name, surname;
    private double balance;

    public BankAccount(String n, String s) {
        this.name = n;
        this.surname = s;
        balance = 0;
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

}
