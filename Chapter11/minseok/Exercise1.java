package Chapter11.minseok;

public class Exercise1 {

    // public static int length(ListNode lis) {
    // int count = 0;
    // while (lis != null) {
    // count++;
    // lis = lis.next;
    // }
    // return count;
    // }

    // public static ListNode insertAfter(ListNode lis, String s, String given) {

    // while (lis != null) {
    // if (lis.info.equals(given)) {
    // ListNode ls = new ListNode();
    // ls.info = s;
    // ls.next = lis.next;
    // lis.next = ls;
    // break;
    // } else {
    // lis = lis.next;
    // }
    // }
    // return lis;
    // }

    // public static ListNode modify(ListNode lis, String old, String ne) {
    // while (lis != null) {
    // if (lis.info.equals(old)) {
    // lis.info = ne;
    // break;
    // }
    // lis = lis.next;

    // }
    // return lis;
    // }

    // public static ListNode modifyAll(ListNode lis, String old, String ne) {
    // while (lis != null) {
    // if (lis.info.equals(old)) {
    // lis.info = ne;
    // }
    // lis = lis.next;
    // }
    // return lis;
    // }

    // public static ListNode insertBefore(ListNode lis, String s, String been) {
    // if (lis == null) {
    // return lis;
    // }
    // if (lis.info.equals(s)) {
    // ListNode ls = new ListNode();
    // ls.info = been;
    // ls.next = lis;

    // return ls;
    // }
    // while (lis.next != null) {
    // if (lis.next.info.equals(s)) {
    // ListNode ls = new ListNode();
    // ls.info = been;
    // ls.next = lis.next;
    // lis.next = ls;
    // break;
    // }
    // lis = lis.next;
    // }
    // return lis;
    // }

    // public static ListNode copy(ListNode lis) {
    // ListNode newList = null;

    // while (lis != null) {
    // ListNode newNode = new ListNode();
    // newNode.info = lis.info;
    // if (newList == null) {
    // newList = newNode;
    // } else {
    // newList.next = newNode;
    // newList = newNode;
    // }
    // lis = lis.next;
    // }
    // return newList;
    // }

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

        while (lis != null) {
            if (lis.info.equals(s)) {
                ListNode ls = new ListNode();
                ls.info = given;
                ls.next = lis.next;
                lis.next = ls;
                break;
            }
            lis = lis.next;
        }
        return lis;
    }

    public static ListNode modify(ListNode lis, String old, String ne) {
        while (lis != null) {
            if (lis.info.equals(old)) {
                lis.info = ne;
                break;
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
        if (lis == null) {
            return lis;
        }

        if (lis.info.equals(given)) {
            ListNode ls = new ListNode();
            ls.info = s;
            ls.next = lis;
            return ls;
        }

        while (lis.next != null) {
            if (lis.next.info.equals(given)) {
                ListNode ls = new ListNode();
                ls.info = s;
                ls.next = lis.next;
                lis.next = ls;
                break;
            }
            lis = lis.next;
        }
        return lis;
    }

    public static ListNode copy(ListNode lis) {
        ListNode newList = null;
        ListNode newTail = null;
        while (lis != null) {
            ListNode newNode = new ListNode();
            newNode.info = lis.info;
            if (newList == null) {
                newList = newNode;
                newTail = newNode;
            } else {
                newTail.next = newNode;
                newTail = newNode;
            }
            lis = lis.next;
        }
        return newList;
    }

    public static ListNode invert(ListNode lis) {
        ListNode prev = null;
        while (lis != null) {
            ListNode nextNode = lis.next;
            lis.next = prev;
            prev = lis;
            lis = nextNode;
        }
        return prev;
    }

    public static ListNode deleteDoubles(ListNode lis) {
        if (lis == null) {
            return lis;
        }

        while (lis != null) {
            ListNode nextNode = lis.next;
            while (nextNode != null && nextNode.info.equals(lis.info)) {
                nextNode = nextNode.next;
            }
            lis.next = nextNode;
            lis = nextNode;
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