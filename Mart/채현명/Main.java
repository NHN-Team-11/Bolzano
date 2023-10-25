package chapter11.thread.Mart;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Arrays.stream("재준,현명,중민,민석,윤호,정훈".split(","))
                .forEach(s -> new Thread(
                        new Buyer(s, store)).start());
    }
}
