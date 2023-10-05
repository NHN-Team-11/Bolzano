package Chapter11.이중민;

import java.io.PrintStream;

public class Exercise2 {
    public static ListNode create3NodesABC() {
        ListNode a = new ListNode();
        ListNode b = new ListNode();
        ListNode c = new ListNode();
        a.info = "A";
        a.next = b;
        b.info = "B";
        b.next = c;
        c.info = "C";
        c.next = null;
        return a;
    }

    public static void print(ListNode lis, PrintStream ps) {
        while (lis != null) {
            ps.print(lis.info + " ");
            lis = lis.next;
        }
        ps.println();
        /**
         * recursion 사용 방법
         * if (lis == null)
         *  ps.println();
         *  else {
         *      ps.print(lis.info);
         *      print(lis.next, ps);
         *  }
         */
    }

    public static int length(ListNode lis, int count) {

        if(lis == null) {
            return count;
        }
        count++;
        return length(lis.next, count);

    }

    public static ListNode insertAfter(ListNode lis, String s, String given) {

        

        ListNode newNode = new ListNode();
        newNode.info = given;

        if(lis.next == null) {
            return lis;
        }

        if(lis.info.equals(s)) {
            newNode.next = lis.next;
            lis.next = newNode;
            insertAfter(newNode.next, s, given);
        }

        else {
            insertAfter(lis.next, s, given);
        }
        return lis;
    }

    public static ListNode insertBefore(ListNode lis, String s, String given) {

        if(lis == null) {
            return lis;
        }
        if(lis.info.equals(s)) {
            ListNode newNode = new ListNode();
            newNode.info = given;
            newNode.next = lis;

            return newNode;
            
        }
        lis.next = insertBefore(lis.next, s, given);
        return lis;
    }

    public static ListNode modify(ListNode lis, String old, String ne) {
        boolean check = false;
        if(lis == null) {
            return lis;
        }
        if(lis.info.equals(old) && !check) {
            lis.info = ne;
            check = true;
            modify(lis.next, old, ne);
        }
        return lis;
    }

    public static ListNode modifyAll(ListNode lis, String old, String ne) {

        if(lis == null) {
            return lis;
        }
        if(lis.info.equals(old)) {
            lis.info = ne;
            modifyAll(lis.next, old, ne);
        }
        else {
            modifyAll(lis.next, old, ne);
        }
        return lis;
    }
    //모르겟음
    public static ListNode deleteDoubles(ListNode lis) {
        ListNode deleteNode = new ListNode();

        ListNode p = new ListNode();
        p.next = lis;
        lis = p;
        
        if(lis.next == null) {
            return lis.next;
        }
        deleteNode.info = p.next.info;
        
        if(!(deleteNode.info.equals(p.next.info))) {
            deleteDoubles(p.next);
        }
        else {
            p.next = p.next.next;
        }
        return lis.next;

    }

    public static boolean searchSequence(ListNode lis1, ListNode lis2) {
        if(lis2 == null) {
            return true;
        }
        if(lis1 == null) {
            return false;
        }
        if(lis1.info.equals(lis2.info)) {
            return searchSequence(lis1.next, lis2.next);
        }
        else {
            return false;
        }
    }

    public static ListNode copy(ListNode lis) {
        if(lis == null) {
            return lis;
        }
        ListNode newNode = new ListNode();
        newNode.info = lis.info;
        newNode.next = copy(lis.next);
        return newNode;
    }
    public static void main(String[] args) {
        ListNode lis = create3NodesABC();
        insertAfter(lis, "B", "A");
        insertBefore(lis, "B", "E");
        // modifyAll(lis, "A", "G");
        deleteDoubles(lis);
        print(lis, System.out);
        print(copy(lis), System.out);
    }
}
