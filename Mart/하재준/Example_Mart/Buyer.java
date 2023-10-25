package Example_Mart;

import java.util.concurrent.ThreadLocalRandom;

public class Buyer extends Thread {
    Store store;

    public Buyer(String name) {
        super(name);
    }

    public Buyer(String name, Store store) {
        super(name);
        this.store = store;
    }

    @Override
    public void run() {
        try {
            store.enter();
            Thread.sleep(ThreadLocalRandom.current()
                    .nextInt(1000, 10000));
            store.buy();
            store.exit();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
