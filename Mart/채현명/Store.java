package chapter11.thread.Mart;

import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;

public class Store {
    Semaphore shopMax;
    private int insideCustomer;
    final int PRODUCT_MAX = 10;
    int product = PRODUCT_MAX;

    public Store(){
        this.shopMax = new Semaphore(5);
        insideCustomer = 0;
    }
    public void enter(){
        try {
            shopMax.acquire();
            insideCustomer++;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("[%d] 손님이 입장 했습니다...%n", insideCustomer);

    }
    public void exit(){
        System.out.printf("[%d] 손님이 퇴장 했습니다...%n", insideCustomer);
        shopMax.release();
        insideCustomer--;

    }

    public synchronized void buy(Buyer buyer){
        if(product < 1){
            System.out.printf(
                    "[%d] 😭 %s 재고 없음%n", product, buyer.name
            );
        }
        else{
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000,5000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("[%d] 💵 구매 완료!" +
                    "%s 구매함.%n" , product, buyer.name);
            product--;
        }

        notifyAll();
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void sell(){
        if(product < 10){
            System.out.printf("[현재 개수: %d] 매대가 비었다.%n", product);
        }else {
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000,10000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("[%d] ✅ 물건을 채워넣었습니다.%n",product);
            product = PRODUCT_MAX;
        }
        notifyAll();
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}