package Bolzano.Mart.이중민.seller_buyer_solution;

import java.util.concurrent.ThreadLocalRandom;

public class Seller extends Thread {
    Store store;
    String[] itemName;
    public Seller(Store store, String[] itemName) {
        this.store = store;
        this.itemName = itemName;
    }

    @Override
    public void run() {
        try {
            while(true) {
                if(store.getStand().size() > 10) {
                    wait();
                    store.sell();
                }
                System.out.println("---------구매 전 리스트--------");
                System.out.println(store.getStand().toString());
                System.out.println("----------------------------");

                String addItem = itemName[ThreadLocalRandom.current().nextInt(itemName.length)];
                System.out.println("추가 할 아이템 : " + addItem);
                store.getStand().add(addItem);

                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 10 * 1000));
//                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {}
    }
}
