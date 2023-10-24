package Example_Mart;

import java.util.concurrent.ThreadLocalRandom;

public class Buyer extends Thread {
    Store store;

    public Buyer(String name, Store store) {
        super(name);
        this.store = store;
    }

    @Override
    public void run() {
        store.buyers.submit(this);
        try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        store.buy();
    }

}
