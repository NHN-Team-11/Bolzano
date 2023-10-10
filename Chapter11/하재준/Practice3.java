
import java.io.PrintStream;

public class Practice3 {
    public static ListNode create3NodesABC() {
        ListNode a = new ListNode();
        ListNode b = new ListNode();
        ListNode c = new ListNode();
        a.info = "1";
        a.next = b;
        b.info = "2";
        b.next = c;
        c.info = "5";
        c.next = null;
        return a;
    }

    public static boolean isSorted(ListNode list) {
        while (list != null) {
            if (Integer.parseInt(list.info) > Integer.parseInt(list.next.info)) {
                return false;
            }
        }
        return true;
    }

    public static boolean search(ListNode list, int num) {
        while (list != null) {
            if (Integer.parseInt(list.info) == num) {
                return true;
            }
        }
        return false;
    }

    public static ListNode addElement(ListNode list, int number) {
        ListNode newNode = new ListNode();
        newNode.info = Integer.toString(number);

        ListNode p = new ListNode();
        p.next = list;
        list = p;

        while (p.next != null) {
            if (Integer.parseInt(p.next.info) >= number) {
                break;
            }
            p = p.next;
        }
        if (Integer.parseInt(p.next.info) >= number) {
            p.next = newNode;
            newNode.next = p.next;
        }

        return list.next;

    }

    public static ListNode delete(ListNode list, int number) {
        ListNode p = new ListNode();
        p.next = list;
        list = p;

        while (p != null) {
            if (Integer.parseInt(p.next.info) == number) {
                p.next = p.next.next;
            }
        }
        return list.next;
    }

    public static ListNode bothList(ListNode list1, ListNode list2) {
        while (list2 != null) {
            list1 = addElement(list1, Integer.parseInt(list2.info));
            list2 = list2.next;
        }
        return list1;
    }

    public static ListNode twoList(ListNode list1, ListNode list2) {
        ListNode newList = new ListNode();
        newList = Practice1.copy(list1);
        while (list2 != null) {
            newList = addElement(newList, Integer.parseInt(list2.info));
            list2 = list2.next;
        }
        return newList;
    }

    public static ListNode intersection(ListNode list1, ListNode list2) {
        ListNode resultNodes = null;
        while (list1 != null) {
            if (search(list2, list1.num)) {
                resultNodes = addElement(resultNodes, list1.num);
            }
            list1 = list1.next;
        }
        return resultNodes;
    }

    public static void main(String[] args) {
        ListNode lis = create3NodesABC();
        addElement(lis, 4);
        while (lis != null) {
            System.out.println(lis.info);
            lis = lis.next;
        }
        // ListNode lis2 = create3NodesABC2();
        // print(addElement(lis, 4), System.out);
        // ListNode merge = twoList(lis, lis2);
        // ListNode merge2 = bothList(lis, lis2);
        // print(bothList(lis, lis2), System.out);
        // print(twoList(bothList(lis, lis2)), System.out);
        // lis.num = 9;
        // print(merge, System.out);
        // print(merge2, System.out);
        // print(intersection(lis, lis2), System.out);
    }
}
