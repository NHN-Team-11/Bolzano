package Chapter11.이중민;

import java.io.PrintStream;

public class Exercise3 {
    public static ListNode create3NodesABC() {
        ListNode a = new ListNode();
        ListNode b = new ListNode();
        ListNode c = new ListNode();
        a.info = "A";
        a.num = 1;
        a.next = b;
        b.info = "B";
        b.num = 3;
        b.next = c;
        c.info = "C";
        c.num = 5;
        c.next = null;
        return a;
    }

    public static ListNode create3NodesABC2() {
        ListNode a = new ListNode();
        ListNode b = new ListNode();
        ListNode c = new ListNode();
        a.info = "A";
        a.num = 1;
        a.next = b;
        b.info = "B";
        b.num = 3;
        b.next = c;
        c.info = "C";
        c.num = 5;
        c.next = null;
        return a;
    }
    public static boolean isSorted(ListNode list) {
        while(list != null) {
            if(list.num > list.next.num) {
                return false;
            }
        }
        return true;
    }

    public static boolean search(ListNode list, int number) {
        if(list == null || list.num > number) {
            return false;
        }
        if(list.num == number) {
            return true;
        }
        return search(list.next, number);
    }
    public static ListNode addElement(ListNode list, int number) {
        ListNode newList = new ListNode();
        newList.num = number;
        if(list == null || list.num >= number) {
            newList.next = list;
            return newList;
        }
        else {
            list.next = addElement(list.next, number);
            return list;
        }
    }

    public static ListNode delete(ListNode list, int number) {
        if(list == null) {
            return list;
        }
        if(list.num == number) {
            list = list.next;
        }
        else {
            list.next = delete(list.next, number);
        }
        return list;
    }

    public static ListNode bothList(ListNode list1, ListNode list2) {
        while(list2 != null) {
            list1 = addElement(list1, list2.num);
            list2 = list2.next;
        }
        return list1;
    }

    public static ListNode twoList(ListNode list1, ListNode list2) {
        ListNode newList = new ListNode();
        newList = Exercise1.copy(list1);
        while(list2 != null) {
            newList = addElement(newList, list2.num);
            list2 = list2.next;
        }
        return newList;
    }

    public static ListNode intersection(ListNode list1, ListNode list2) {
        ListNode resultNodes = null;
        while (list1 != null) {
            if(search(list2, list1.num)) {
                resultNodes = addElement(resultNodes, list1.num);
            }
            list1 = list1.next;
        }
        return resultNodes;
    }

     public static void print(ListNode lis, PrintStream ps) {
        while (lis != null) {
            ps.print(lis.num + " ");
            lis = lis.next;
        }
        System.out.println();
    }
    public static void main(StringJM[] args) {
        ListNode lis = create3NodesABC();
        ListNode lis2 = create3NodesABC2();
        // print(addElement(lis, 4), System.out);
        // ListNode merge = twoList(lis, lis2);
        // ListNode merge2 = bothList(lis, lis2);
        // print(bothList(lis, lis2), System.out);
        // print(twoList(bothList(lis, lis2)), System.out);
        // lis.num = 9;
        // print(merge, System.out);
        // print(merge2, System.out);
        print(intersection(lis, lis2), System.out);
    }
}
