public class BankAccount {
    private String name, surname;
    private double balance;

    public BankAccount(String n, String s) {
        name = n;
        surname = s;
        balance = 0;
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount("Mario", "Rossi");
        System.out.println("Before the operations: " + ba);
        ba.deposit(1000);
        ba.withdraw(100);
        System.out.println("After the Operation" + ba);
    }

    boolean sameOwner(BankAccount ba) {
        if (this.name.equals(ba.name) && this.surname.equals(ba.surname) && this.balance == ba.balance) {
            return true;
        }

        return false;
    }

    void transferTo(BankAccount ba, double balance) {
        this.balance = this.balance - balance;
        ba.balance = ba.balance + balance;
    }

    private void withdraw(int i) {
        this.balance = this.balance + i;
    }

    public void deposit(int i) {
        this.balance = this.balance + i;
    }

    public String toString() {
        return "{ Owner: " + name + " " + surname +
                " - Balance: Euro " + balance + " }";
    }
}
