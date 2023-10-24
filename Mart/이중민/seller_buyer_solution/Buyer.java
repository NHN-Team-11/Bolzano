package Bolzano.Mart.이중민.seller_buyer_solution;

import java.util.concurrent.ThreadLocalRandom;

public class Buyer extends Thread {
    Store store;
    String deleteItem;
    public Buyer(String name, Store store) {
        super(name);
        this.store = store;
        deleteItem = "";
    }

    @Override
    public void run() {
        store.enter();
        try {

            Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 10 * 1000));

            int itemNumber = ThreadLocalRandom.current().nextInt(store.getStand().size());
            deleteItem = store.getStand().get(itemNumber);
            store.getStand().remove(itemNumber);

            System.out.println(Thread.currentThread().getName() + " " + deleteItem + " 구매 완료.");

            System.out.println("-------구매 후 리스트-----------");
            System.out.println(store.getStand().toString());
            System.out.println("-----------------------------");

            store.buy();



        } catch (InterruptedException e) {}
        store.exit();
    }
}
