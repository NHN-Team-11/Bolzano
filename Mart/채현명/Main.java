package chapter11.thread.Mart;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Arrays.stream("재준,현명,중민,민석,윤호,정훈".split(","))
                .forEach(s -> new Thread(
                        new Buyer(s, store)
                ).start());

//        Buyer buyer1 = new Buyer("재준", store);
//        Buyer buyer2 = new Buyer("현명", store);
//        Buyer buyer3 = new Buyer("중민", store);
//        Buyer buyer4 = new Buyer("민석", store);
//        Buyer buyer5 = new Buyer("윤호", store);
//        Buyer buyer6 = new Buyer("정훈", store);
//        new Thread(new Seller(store)).start();
//
//        buyer1.start();
//        buyer2.start();
//        buyer3.start();
//        buyer4.start();
//        buyer5.start();
//        buyer6.start();
    }
}
