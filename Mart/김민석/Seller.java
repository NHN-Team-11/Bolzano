package Mart.김민석;

import java.util.concurrent.ThreadLocalRandom;

public class Seller extends Thread {
    Store store;
    Buyer buyer;

    public Seller(Store store) {
        this.store = store;

    }

    @Override
    public void run() {
        synchronized (this) {
            while (true) {
                try {
                    if (store.Item.size() == 0) {
                        store.sell();
                        System.out.println("물품을 채워 놓았습니다.");
                    }
                    String additem = store.itemList[buyer.item];
                    System.out.println("추가할 아이템 : " + additem);
                    store.Item.add(additem);
                    Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 10000));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}