package Example_Mart;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class Store {
    List<String> itemList = new ArrayList<String>();
    String[] items = { "사과", "오이", "양파", "포도", "고추",
            "치약", "칫솔", "비누", "감자", "고구마" };
    Semaphore buyers;

    public Store() {
        buyers = new Semaphore(5);
        for (int i = 0; i < items.length; i++) {
            itemList.add(items[i]);
        }
    }

    public void enter() throws InterruptedException {
        buyers.acquire();
        System.out.println(Thread.currentThread().getName() + "님이 입장하셨습니다.");
    }

    public void exit() {
        System.out.println(Thread.currentThread().getName() + "님이 퇴장하셨습니다.");
        buyers.release();
    }

    public synchronized void buy() {
        String item = itemList.remove((int) (Math.random() * itemList.size()));
        System.out.println(item + "을 구매하셨습니다.");
        notify();
    }

    public synchronized void sell() throws InterruptedException {
        while (itemList.size() >= 10) {
            wait();
        }
        notify();
        int newItemIndex = (int) (Math.random() * 10);
        itemList.add(items[newItemIndex]);

        System.out.println(items[newItemIndex] + "를 채워 넣었습니다.");
        System.out.println(this.itemList.toString());
    }
}
