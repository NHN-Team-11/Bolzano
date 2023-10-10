public class Practice1 {
    public static ListNode create5NodesABC() {
        ListNode a = new ListNode();
        ListNode b = new ListNode();
        ListNode c = new ListNode();
        ListNode e = new ListNode();
        ListNode c2 = new ListNode();
        a.info = "B";
        a.next = b;
        b.info = "A";
        b.next = c;
        c.info = "B";
        c.next = e;
        e.info = "C";
        e.next = c2;
        c2.info = "C";
        c2.next = null;
        return a;
    }

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

    public static int length(ListNode lis) {
        int count = 0;
        while (lis != null) {
            count += 1;
            lis = lis.next;
        }

        return count;
    }

    public static ListNode insertAfter(ListNode lis, String s, String given) {
        ListNode p = new ListNode();
        ListNode sNode = new ListNode();
        sNode.info = s;
        p.info = "ac";
        p.next = lis;
        lis = p;
        while (p != null) {
            if (p.info.equals(given)) {
                sNode.next = p.next;
                p.next = sNode;
            }
            p = p.next;
        }

        return lis.next;

    }

    public static ListNode modify(ListNode lis, String old, String ne) {
        while (lis != null) {
            if (lis.info.equals(old)) {
                lis.info = ne;
                return lis;
            }
            lis = lis.next;

        }
        return lis;
    }

    public static ListNode modifyAll(ListNode lis, String old, String ne) {
        while (lis != null) {
            if (lis.info.equals(old)) {
                lis.info = ne;
            }
            lis = lis.next;

        }
        return lis;
    }

    public static ListNode insertBefore(ListNode lis, String s, String given) {
        ListNode p = new ListNode();
        ListNode sNode = new ListNode();

        sNode.info = s;
        p.info = "ac";
        p.next = lis;
        lis = p;

        while (p.next != null) {
            if (p.next.info.equals(given)) {
                sNode.next = p.next;
                p.next = sNode;
                break;
            }
            p = p.next;
        }
        return lis.next;
    }

    public static ListNode copy(ListNode lis) {
        ListNode copyLis = new ListNode();
        ListNode p = new ListNode();

        p.next = copyLis;
        copyLis = p;
        while (p.next != null) {
            p.next = new ListNode();
            p.next.info = lis.info;
            p.next.next = lis.next;
            lis = lis.next;
            p = p.next;
        }

        return copyLis.next;
    }

    public static ListNode invert(ListNode lis) {
        return lis;
    }

    public static ListNode deleteDoubles(ListNode lis) {
        String first = lis.info;
        ListNode p = lis;
        lis = p;
        p = p.next;
        while (p.next != null) {

            if (first.equals(p.next.info)) {
                p.next = p.next.next;
            }
            p = p.next;

        }
        return lis.next;
    }

    public static boolean searchSequence(ListNode lis1, ListNode lis2) {
        String str1 = "";
        String str2 = "";

        while (lis2 != null) {
            str2 += lis2.info;
            lis2 = lis2.next;
        }

        int length = length(lis1);

        for (int i = 0; i < length - str2.length(); i++) {
            ListNode p = new ListNode();
            p.next = lis1.next;
            lis1 = p;
            p = p.next;
            for (int j = 0; j < str2.length(); j++) {
                str1 += p.info;
                p = p.next;
            }
            if (str1.equals(str2)) {
                return true;
            }
            lis1 = lis1.next;
            str1 = "";
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode p = create5NodesABC();
        ListNode p2 = create3NodesABC();
        // System.out.println(length(p));
        // p = insertBefore(p, "D", "E");
        // p = insertAfter(p, "F", "E");
        // System.out.println(length(p));
        // // modifyAll(p, "C", "F");
        // while (p != null) {
        // System.out.println(p.info);
        // p = p.next;
        // }

        // ListNode copyP = deleteDoubles(p);
        // // System.out.println(length(p));
        // while (copyP != null) {
        // System.out.println(copyP.info);
        // copyP = copyP.next;
        // }
        System.out.println(searchSequence(p, p2));

    }
}
