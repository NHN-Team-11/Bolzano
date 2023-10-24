package Example_Mart;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Store {
    List<String> itemList = new ArrayList<String>();
    String[] items = { "사과", "오이", "양파", "포도", "고추", "치약", "칫솔", "비누", "감자", "고구마" };
    ExecutorService buyers = Executors.newFixedThreadPool(5);

    public Store() {
        itemList.add("사과");
        itemList.add("오이");
        itemList.add("양파");
        itemList.add("포도");
        itemList.add("고추");
        itemList.add("치약");
        itemList.add("칫솔");
        itemList.add("비누");
        itemList.add("감자");
        itemList.add("고구마");
    }

    // public void enter() {

    // }

    // public void exit() {

    // }

    public synchronized void buy() {
        String item = itemList.remove((int) (Math.random() * itemList.size()));
        System.out.println(item + "을 구매하셨습니다.");
    }

    public synchronized void sell() {
        notifyAll();
        int newItemIndex = (int) (Math.random() * 10);
        if (itemList.size() <= 10) {
            itemList.add(items[newItemIndex]);
        }
        System.out.println(items[newItemIndex] + "를 채워 넣었습니다.");
    }

    public int getItemListSize() {
        return this.itemList.size();
    }

    public boolean isFool() {
        if (getItemListSize() == 10) {
            return true;
        }
        return false;
    }

}
