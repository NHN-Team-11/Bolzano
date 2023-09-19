public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("Mario", "Rossi");
        BankAccount ba2 = new BankAccount("Carla", "Verdi");
        BankAccount ba3 = new BankAccount("Carla", "Verdi");
        System.out.println("Do ba1 and ba2 have the same owner?" + ba1.sameOwner(ba2));
        System.out.println("Do ba1 and ba3 have the same owner?" + ba2.sameOwner(ba3));

        ba1.deposit(1000);
        ba2.deposit(500);
        ba3.deposit(750);
        System.out.println("Before the transfer ...");
        System.out.println(ba1);
        System.out.println(ba2);
        ba1.transferTo(ba2, 250);
        System.out.println("After the transfer...");
        System.out.println(ba1);
        System.out.println(ba2);

    }
}
