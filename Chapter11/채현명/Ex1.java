package Chapter11.채현명;

public class Ex1 {
    public static int length(ListNode lis) {
        int count = 0;

        while (lis != null) {
            lis = lis.next;
            count++;
        }
        return count;
    }

    public static ListNode insertAfter(ListNode lis, String s, String given) {
        ListNode head = lis;

        while (lis != null) {
            if (lis.info.equals(given)) {
                ListNode newNode = new ListNode();
                newNode.info = s;
                newNode.next = lis.next;
                lis.next = newNode;
                break;
            }
            lis = lis.next;
        }
        return head;

    }

    public static ListNode modify(ListNode lis, String old, String ne) {
        ListNode head = lis;
        while (lis != null && lis.next != null) {
            if (lis.next.info.equals(old)) {
                lis.next.info = ne;
                break;
            }
            lis = lis.next;
        }
        return head;
    }

    public static ListNode modifyAll(ListNode lis, String old, String ne) {
        ListNode head = lis;
        while (lis != null && lis.next != null) {
            if (lis.next.info.equals(old)) {
                lis.next.info = ne;
            }
            lis = lis.next;
        }
        return head;
    }

    public static ListNode insertBefore(ListNode lis, String s, String given) {
        ListNode head = lis;
        ListNode before = null;
        while (lis != null) {
            if (lis.next.info.equals(given)) {
                ListNode newNode = new ListNode(s);
                if (before != null) {
                    before.next = newNode;
                } else {
                    head = newNode;
                }
                newNode.next = lis;
                break;
            }
            before = lis;
            lis = lis.next;
        }
        return head;
    }

    public static ListNode copy(ListNode lis) {
        if (lis == null) {
            return null;
        }

        ListNode node = new ListNode();
        ListNode current = node;

        while (lis != null) {
            current.next = new ListNode(lis.info);
            lis = lis.next;
            current = current.next;
        }
        return node.next;
    }

    public static ListNode invert(ListNode lis) {
        ListNode prev = null;

        while (lis != null) {
            ListNode current = lis;
            lis = lis.next;
            current.next = prev;
            prev = current;
        }
        return prev;
    }

    /*
     * 중복된 값을 제거하는거
     */
    public static ListNode deleteDoubles(ListNode lis) {
        ListNode p = new ListNode();
        p.next = lis;
        lis = p;

        ListNode deleteNode = new ListNode();
        deleteNode.info = p.next.info;

        while (p.next != null) {
            p = p.next;
            if (deleteNode.info.equals(p.next.info)) {
                p.next = p.next.next;
            }
        }
        return lis.next;
    }

   

    public static boolean searchSequence(ListNode lis1, ListNode lis2) {
        ListNode first = lis1;
        ListNode second = lis2;

        while (first != null && second != null) {
            if (first.info == second.info) {
                second = second.next;
            }
            first = first.next;
        }
        return second == null;
    }

    public static void main(String[] args) {
        ListNode orign = new ListNode("a");
        orign.next = new ListNode("b");
        orign.next.next = new ListNode("c");

        orign = insertAfter(orign, "X", "b");
        printList(orign);
        // modify(head, "C", "안녕");
        // modifyAll(head, "A", "Hello");

        ListNode copyList = copy(orign);
        ListNode invertList = invert(copy(orign));
        printList(invertList);
        // ListNode deleteList = deleteDoubles(copy(orign));
        // ListNode list2 = new ListNode("B");
        // list2.next = new ListNode("C");
        // list2.next = new ListNode("C");

        // printList(orign);
        // boolean rest = searchSequence(list2, list2);
        // System.out.println(rest);
        // printList(copyList);
        // printList(invertList);
        // printList(deleteList);

    }

    public static void printList(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.info + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }
}
