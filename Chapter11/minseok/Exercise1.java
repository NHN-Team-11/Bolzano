package Chapter11.minseok;

public class Exercise1 {

    public static int length(ListNode list) {
        int count = 0;
        ListNode lis = list;
        while (lis != null) {
            count++;
            lis = lis.next;
        }

        return count;

    }

    public static ListNode insertAfter(ListNode lis, String s, String given) {
        ListNode list = lis;

        while (list != null) {
            if (list.info.equals(s)) {
                ListNode ls = new ListNode();
                ls.info = s;
                ls.next = list.next;
                list.next = ls;
                break;
            }
            list = list.next;
        }
        return lis;
    }

    public static ListNode modify(ListNode lis, String old, String ne) {
        ListNode list = lis;
        while (list != null) {
            if (list.info.equals(old)) {
                list.info = ne;
                break;
            }
            list = list.next;
        }
        return lis;
    }

    public static ListNode modifyAll(ListNode lis, String old, String ne) {
        ListNode list = lis;
        while (list != null) {
            if (list.info.equals(old)) {
                list.info = ne;
            }
            list = list.next;
        }
        return lis;
    }

    public static ListNode insertBefore(ListNode lis, String s, String given) {
        if (lis == null) {
            return lis;
        }

        if (lis.info.equals(given)) {
            ListNode ls = new ListNode();
            ls.info = s;
            ls.next = lis;
            return ls;
        }

        ListNode list = lis;
        while (list.next != null) {
            if (list.next.info.equals(given)) {
                ListNode ls = new ListNode();
                ls.info = s;
                ls.next = list.next;
                list.next = ls;
                break;
            }
            list = list.next;
        }
        return lis;
    }

    public static ListNode copy(ListNode lis) {
        ListNode newList = null;
        ListNode newTail = null;
        ListNode list = lis;
        while (list != null) {
            ListNode newNode = new ListNode();
            newNode.info = list.info;
            if (newList == null) {
                newList = newNode;
                newTail = newNode;
            } else {
                newTail.next = newNode;
                newTail = newNode;
            }
            list = list.next;
        }
        return newList;
    }

    public static ListNode invert(ListNode lis) {
        ListNode prev = null;
        ListNode list = lis;
        while (list != null) {
            ListNode nextNode = list.next;
            list.next = prev;
            prev = list;
            list = nextNode;
        }
        return prev;
    }

    public static ListNode deleteDoubles(ListNode lis) {
        if (lis == null) {
            return lis;
        }

        ListNode list = lis;
        while (list != null) {
            ListNode nextNode = list.next;
            while (nextNode != null && nextNode.info.equals(list.info)) {
                nextNode = nextNode.next;
            }
            list.next = nextNode;
            list = nextNode;
        }
        return lis;
    }

    public static boolean searchSequence(ListNode lis1, ListNode lis2) {
        ListNode list1 = lis1;
        ListNode list2 = lis2;

        while (list1 != null) {
            while (list1 != null && list1.info.equals(list2.info)) {
                list1 = list1.next;
                list2 = list2.next;
            }
            if (list2 == null) {
                return true;
            }
            if (list1 != null) {
                list1 = list1.next;
            }
            list2 = lis2;
        }
        return false;
    }
}