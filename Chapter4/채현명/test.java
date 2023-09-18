package Chapter4.채현명;

class Account {
    public int bal;

    public Account(int x) {
        bal = x;
    }
}

public class test {

    public static void main(String[] args) {
        Account r1, r2;
        r1 = new Account(100);
        r2 = r1;
        r2.bal = 234;
        System.out.println("r1.bal = " + r1.bal);
    }

}
