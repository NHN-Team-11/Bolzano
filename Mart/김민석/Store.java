package Mart.김민석;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Store {
    Semaphore enterPerson;
    List<String> Item;

    int currentPerson;
    String[] itemList;

    public Store(String[] itemList, int currentPerson) {
        enterPerson = new Semaphore(currentPerson);
        Item = new ArrayList<>();
        this.itemList = itemList;
        for (String s : itemList) {
            Item.add(s);
        }
        this.currentPerson = currentPerson;

    }

    public void enter() {
        try {
            enterPerson.acquire();
            System.out.println(Thread.currentThread().getName() + "손님이 입장 하셨습니다.");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        currentPerson++;

    }

    public void exit() {
        System.out.println(Thread.currentThread().getName() + "손님이 퇴장 하셨습니다.");
        enterPerson.release();
        currentPerson--;
    }

    public void buy() {
        synchronized (this) {
            try {
                if (Item.size() == 0) {
                    wait();
                    sell();
                }
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            notify();
        }
    }

    public void sell() {
        synchronized (this) {
            try {
                if (Item.size() > 10) {
                    wait();
                    buy();
                }

                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            notify();
        }
    }
}