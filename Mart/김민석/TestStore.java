package Mart.김민석;

public class TestStore {
    public static void main(String[] args) {
        String[] item = new String[] { "사과", "파인애플", "포도", "귤", "참외" };
        Store store = new Store(item, 4);

        Seller seller = new Seller(store);

        seller.setDaemon(true);
        Buyer[] buyers = new Buyer[10];
        for (int i = 0; i < buyers.length; i++) {
            buyers[i] = new Buyer(i + "번", store);
            buyers[i].start();

        }
    }
}
