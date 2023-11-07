package Mart.김민석;

import java.util.concurrent.ThreadLocalRandom;

public class Buyer extends Thread {
    Store store;
    int item = ThreadLocalRandom.current().nextInt(store.Item.size());

    public Buyer(String name, Store store) {
        super(name);
        this.store = store;
    }

    @Override
    public void run() {
        synchronized (this) {
            store.enter();
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 10000));
                System.out.println(Thread.currentThread().getName() + "손님이 " + store.Item.get(item) + " 구매 하셨습니다.");
                store.buy();

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            store.exit();

        }
    }
}
