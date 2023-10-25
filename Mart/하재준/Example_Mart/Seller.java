package Example_Mart;

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
                store.sell();
                Thread.sleep(ThreadLocalRandom.current()
                        .nextInt(1000, 10000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
