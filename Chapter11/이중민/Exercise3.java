package Chapter11.이중민;

import java.io.PrintStream;
import java.util.ArrayList;

import java.util.Collections;

import java.util.List;



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
        ListNode newNode = new ListNode();
        newNode.num = number;
        if(list == null || list.num > number) {
            newNode.next = list;
            return newNode;
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

    public static List<Integer> bothList(List<Integer> list1, List<Integer> list2) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            list.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            list.add(list2.get(i));
        }
        Collections.sort(list);
        return list;
    }

     public static void print(ListNode lis, PrintStream ps) {
        while (lis != null) {
            ps.print(lis.num + " ");
            lis = lis.next;
        }
    }
    public static void main(String[] args) {
        ListNode lis = create3NodesABC();
        
        print(addElement(lis, 4), System.out);
    }
}
