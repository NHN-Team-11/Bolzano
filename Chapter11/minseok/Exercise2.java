package Chapter11.minseok;

public class Exercise2 {
    public static int length(ListNode lis) {
        if (lis == null) {
            return 0;
        }
        return 1 + length(lis.next);
    }

    public static ListNode insertAfter(ListNode lis, String s, String given) {
        if (lis == null) {
            return null;
        } else if (lis.info.equals(given)) {
            ListNode ls = new ListNode(s);
            ls.next = lis.next;
            lis.next = ls;
        }
        lis.next = insertAfter(lis.next, s, given);
        return lis;
    }

    public static ListNode modify(ListNode lis, String old, String ne) {
        if (lis == null) {
            return null;
        } else if (lis.info.equals(old)) {
            lis.info = ne;
        }
        lis.next = modify(lis.next, old, ne);
        return lis;
    }

    public static ListNode modifyAll(ListNode lis, String old, String ne) {
        if (lis == null) {
            return null;
        }
        if (lis.info.equals(old)) {
            lis.info = ne;
        }
        lis.next = modifyAll(lis.next, old, ne);
        return lis;
    }

    public static ListNode insertBefore(ListNode lis, String s, String given) {
        if (lis == null) {
            return null;
        }
        if (lis.info.equals(given)) {
            ListNode ls = new ListNode(s);
            ls.next = lis;
            return ls;
        }
        lis.next = insertBefore(lis.next, s, given);
        return lis;
    }

    public static ListNode copy(ListNode lis) {
        if (lis == null) {
            return null;
        }
        ListNode ls = new ListNode(lis.info);
        ls.next = copy(lis.next);
        return ls;
    }

    public static ListNode invert(ListNode lis) {
        if (lis == null || lis.next == null) {
            return lis;
        }
        ListNode rest = invert(lis.next);
        lis.next.next = lis;
        lis.next = null;
        return rest;
    }

    public static ListNode deleteDoubles(ListNode lis) {
        if (lis == null) {
            return null;
        }
        if (lis.next != null && lis.next.info.equals(lis.info)) {
            lis.next = lis.next.next;
            return deleteDoubles(lis);
        }
        lis.next = deleteDoubles(lis.next);
        return lis;
    }

    public static boolean searchSequence(ListNode lis1, ListNode lis2) {
        if (lis2 == null) {
            return true;
        }
        if (lis1 == null) {
            return false;
        }
        if (lis1.info.equals(lis2.info)) {
            return searchSequence(lis1.next, lis2.next);
        }
        return searchSequence(lis1.next, lis2);
    }

}
