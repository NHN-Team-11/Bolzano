package chapter11.thread.Mart;

import java.util.concurrent.ThreadLocalRandom;

public class Seller extends Thread {
    Store store;

    public Seller(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 10000));
                store.sell();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}