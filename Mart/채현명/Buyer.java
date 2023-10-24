package chapter11.thread.Mart;

public class Buyer extends Thread{
    Store store;
    String name;

    public Buyer(String name, Store store){
        this.name = name;
        this.store = store;
    }

    @Override
    public void run() {
        while (true){
            store.enter();
            store.buy(this);
            store.exit();
        }
    }


}