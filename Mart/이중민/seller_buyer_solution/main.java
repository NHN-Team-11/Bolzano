package Bolzano.Mart.이중민.seller_buyer_solution;

public class main {
    public static void main(String[] args) {
        Store store = new Store();

        Seller seller = new Seller(store, new String[] {"사과", "포도", "배", "복숭아", "참외", "용과", "귤", "딸기", "파인애플", "레몬"});
        seller.setDaemon(true);

        seller.start();

        Buyer[] buyers = new Buyer[10];
        for (int i = 0; i < buyers.length; i++) {
            buyers[i] = new Buyer(i + "번" , store);
            buyers[i].start();

        }

    }
}
