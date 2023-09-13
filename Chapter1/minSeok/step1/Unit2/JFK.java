
public class JFK {
    JFK() {

    }

    public static void main(String[] args) {
        String first = "John";
        String middle = "Fitzgerald";
        String last = "Kennedy";
        String initals;
        String firstInit, middleInit, lastInit;
        firstInit = first.substring(0, 1);
        middleInit = middle.substring(0, 1);
        lastInit = last.substring(0, 1);
        initals = firstInit + middleInit + lastInit;
        System.out.println(initals);

        // System.out.println(first.substring(0, 1).concat(middle.substring(0,
        // 1).concat(last.substring(0, 1))));
    }

}
