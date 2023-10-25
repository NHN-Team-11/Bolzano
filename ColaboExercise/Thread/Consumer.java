package ColaboExercise.Thread;

import java.util.concurrent.ThreadLocalRandom;

public class Consumer extends Thread {
    Store store;

    public Consumer(String name, Store store) {
        super(name);
        this.store = store;
    }

    @Override
    public void run() {
        store.enter();
        try {
            store.buy();
            Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 10 * 1000));
        } catch (InterruptedException e) {
        }
        store.exit();
    }
}
