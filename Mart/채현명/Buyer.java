package chapter11.thread.Mart;

import java.util.concurrent.ThreadLocalRandom;

public class Buyer extends Thread {
    Store store;
    String name;

    public Buyer(String name, Store store) {
        this.name = name;
        this.store = store;
    }

    @Override
    public void run() {
        try {
            while (true) {
                store.enter();
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 10000));
                store.buy(this);
                store.exit();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
