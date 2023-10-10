class ListNode {
    String info;
    ListNode next;

}

public class TestList {
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

    public static ListNode insertFrist(ListNode lis, String s) {
        ListNode p = new ListNode();
        p.info = s;
        p.next = lis;
        lis = p;

        return lis;

    }

    public static boolean search(ListNode lis, String s) {
        while (lis != null) {
            if (lis.info.equals(s)) {
                return true;
            }
            lis = lis.next;
        }
        return false;
    }

    public static ListNode insertLast(ListNode lis, String s) {
        ListNode p = new ListNode();
        p.info = s;
        if (lis == null) {
            return p;
        } else {
            ListNode last = lis;
            while (last.next != null) {
                last = last.next;
            }
            last.next = p;
            return lis;
        }
    }

    public static ListNode deleteAll(ListNode lis, String s) {
        if (lis == null) {
            return null;
        } else if (lis.info.equals(s)) {
            return deleteAll(lis.next, s);
        } else {
            lis.next = deleteAll(lis.next, s);
            return lis;
        }
    }

    public static void main(String[] args) {
        ListNode a = create3NodesABC();
        deleteAll(a, "B");
        ListNode p = a;
        while (p != null) {
            System.out.println(p.info);
            p = p.next;
        }

    }

}
