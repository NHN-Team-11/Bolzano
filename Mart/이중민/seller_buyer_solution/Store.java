package Bolzano.Mart.이중민.seller_buyer_solution;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;

public class Store {
    Semaphore enterPeople = new Semaphore(5);
    private List<String> stand;
    String[] itemName;
    public Store() {
        stand = new ArrayList<>();
        itemName = new String[] {"사과", "포도", "배", "복숭아", "참외", "용과", "귤", "딸기", "파인애플", "레몬"};
    }

    public void enter() {
        try {
            enterPeople.acquire();
            System.out.println(Thread.currentThread().getName() + " 입장");
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
    }

    public void exit() {
        System.out.println(Thread.currentThread().getName() + " 퇴장");
        enterPeople.release();
    }

    public synchronized void buy() {
//        synchronized (this) {
            try {
                if (stand.isEmpty()) {
                    wait();
                    sell();
                }
            } catch (InterruptedException e) {}

            int deleteIndex = ThreadLocalRandom.current().nextInt(stand.size());
            System.out.println(Thread.currentThread().getName() + " 손님이 " + stand.get(deleteIndex) + "를(을) 구매 하였습니다.");
            stand.remove(deleteIndex);

            notifyAll();
//        }
    }

    public synchronized void sell() {
//        synchronized (this) {
            try {
                if(stand.size() > 10) {
                    wait();
//                    Thread.currentThread().interrupt();
                }
            } catch (InterruptedException e) {}
            int addIndex = ThreadLocalRandom.current().nextInt(itemName.length - 1);
            stand.add(itemName[addIndex]);
            System.out.println("======진열대======");
            System.out.println(stand);
            System.out.println("================");

            notifyAll();
//        }
    }

    @Override
    public String toString() {
        return "Store{" +
                "stand=" + stand +
                '}';
    }

}
