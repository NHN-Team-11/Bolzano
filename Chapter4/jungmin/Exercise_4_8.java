package Bolzano.Chapter4.jungmin;

class Account {
    public int bal;
    public Account(int x) {
        this.bal = x;
    }
}
public class Exercise_4_8 {
    public static void method(int a, Account b) {
        a *= 2;
        b.bal *= 2;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int c = 100;
        Account r = new Account(100);
        method(c, r);
        sb.append(c + " " + r.bal);
        System.out.println(sb);
    }
    
}
