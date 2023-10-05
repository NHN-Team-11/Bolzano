package Chapter11.minseok;

public class Exercise3 {

    public boolean ordered(ListNode lis) {
        while (lis != null) {
            if (lis.val > lis.next.val) {
                return false;
            }
            lis = lis.next;
        }
        return true;
    }

    public boolean search(ListNode lis, int target) {
        if (lis == null) {
            return false;
        }
        if (lis.val == target) {
            return true;
        }
        if (lis.val > target) {
            return false;
        }
        return search(lis.next, target);
    }

    public ListNode add(ListNode lis, int number) {
        ListNode newList = new ListNode(number);
        if (lis == null || lis.val > number) {
            newList = lis.next;
            return newList;
        } else {
            lis.next = add(lis.next, number);
            return lis;
        }

    }

    public ListNode delete(ListNode lis, int number) {
        if (lis == null) {
            return lis;
        }
        if (lis.val == number) {
            lis = lis.next;
        } else {
            lis.next = delete(lis.next, number);
        }
        return lis;
    }

    public ListNode bothList(ListNode lis1, ListNode lis2) {
        ListNode newList = new ListNode(0);
        ListNode current = newList;
        while (lis1 != null && lis2 != null) {
            if (lis1.val < lis2.val) {
                current.next = new ListNode(lis1.val);
                lis1 = lis1.next;
            } else {
                current.next = new ListNode(lis2.val);
                lis2 = lis2.next;
            }
            current = current.next;
        }
        return newList.next;
    }

    public ListNode merge(ListNode lis1, ListNode lis2) {
        ListNode newList = new ListNode(0);
        ListNode current = newList;
        while (lis1 != null && lis2 != null) {
            if (lis1.val < lis2.val) {
                current.next = lis1;
                lis1 = lis1.next;
            } else {
                current.next = lis2;
                lis2 = lis2.next;
            }
            current = current.next;
        }
        if (lis1 != null) {
            current.next = lis1;
        } else {
            current.next = lis2;
        }
        return newList.next;

    }

    public ListNode interSection(ListNode lis1, ListNode lis2) {
        ListNode newList = new ListNode(0);
        ListNode current = newList;
        while (lis1 != null && lis2 != null) {
            if (lis1.val == lis2.val) {
                current.next = new ListNode(lis1.val);
                current = current.next;
                lis1 = lis1.next;
                lis2 = lis2.next;
            } else if (lis1.val < lis2.val) {
                lis1 = lis1.next;
            } else {
                lis2 = lis2.next;
            }

        }
        return newList.next;
    }

}
