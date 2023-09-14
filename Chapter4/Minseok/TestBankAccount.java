package Chapter4.Minseok;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount("마리오", "로시");
        System.out.println("작업 전: " + ba);
        ba.deposit(1000);
        ba.withdraw(100);
        System.out.println(("작업 후: " + ba));
    }

}
