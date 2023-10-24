package Bolzano.Mart.이중민.seller_buyer_solution;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;

public class Store {
    Semaphore enterPeople = new Semaphore(5);
    private List<String> stand;
    public Store() {
        this.stand = new ArrayList<>(List.of("사과", "포도", "배", "복숭아", "참외", "용과", "귤", "딸기", "파인애플", "레몬")) ;
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
        notifyAll();
        sell();
    }

    public synchronized void sell() {
        if(stand.size() > 10) {
            buy();
        }
        notifyAll();
    }

    @Override
    public String toString() {
        return "Store{" +
                "stand=" + stand +
                '}';
    }

    public List<String> getStand() {
        return stand;
    }


}
