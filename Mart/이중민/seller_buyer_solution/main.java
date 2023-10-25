package Bolzano.Mart.이중민.seller_buyer_solution;

public class main {
    public static void main(String[] args) {
        Store store = new Store();

        Producer seller = new Producer(store);
        seller.setDaemon(true);

        seller.start();

        Consumer[] buyers = new Consumer[10];
        for (int i = 0; i < buyers.length; i++) {
            buyers[i] = new Consumer(i + "번" , store);
            buyers[i].start();
        }

    }
}
