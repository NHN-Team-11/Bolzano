package ColaboExercise.Thread;

import java.util.concurrent.ThreadLocalRandom;

public class Producer extends Thread {
    Store store;

    public Producer(Store store) {
        this.store = store;

    }
    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                store.sell();
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 10 * 1000));
                // Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
