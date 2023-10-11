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
            if (search(list2, Integer.parseInt(list1.info))) {
                resultNodes = addElement(resultNodes, Integer.parseInt(list1.info));
            }
            list1 = list1.next;
        }
        return resultNodes;
    }

}
