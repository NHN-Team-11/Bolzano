package chapter11.thread.Mart;

public class Seller extends Thread{
    Store store;
    public Seller(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true){
            store.sell();
        }
    }

}