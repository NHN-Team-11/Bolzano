package chapter11.thread.Mart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Store {
    private Semaphore shopMax;
    private int product;
    private final int PRODUCT_MAX = 10;

    private List<String> list;

    public Store() {
        this.shopMax = new Semaphore(5);
        this.product = PRODUCT_MAX;
        this.list = new ArrayList<>(
                Arrays.asList("사과", "포도", "귤", "초콜렛", "하기스", "매직팬티", "아이폰15"));

    }

    public void enter() {
        try {
            shopMax.acquire();
            System.out.printf(Thread.currentThread().getName() + "손님이 입장 했습니다...%n");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void exit() {
        System.out.println(Thread.currentThread().getName() + "손님이 퇴장 했습니다..");
        shopMax.release();
    }

    public synchronized void buy(Buyer buyer) {
        while (product < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        int randomIndex = (int) (Math.random() * list.size());
        String purchasedProduct = list.get(randomIndex);

        System.out.printf("[%d]....[%s] 💵 구매 완료! %s 구매함.%n",
                product, buyer.name, purchasedProduct);
        product--;
        notifyAll();
    }

    public synchronized void sell() {
        while (product >= 10) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        int randomIndex = (int) (Math.random() * list.size());
        String purchasedProduct = list.get(randomIndex);
        System.out.printf("[현재 개수: %d] 매대가 비었다.%n", product);
        product = PRODUCT_MAX;
        System.out.printf("[현재 개수: %d] ✅ %s을 채워넣었습니다.%n", product, purchasedProduct);
        notifyAll();
    }
}
