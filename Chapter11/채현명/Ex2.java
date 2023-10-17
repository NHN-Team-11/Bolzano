package Chapter11.채현명;

public class Ex2 { // insert, modify 우선적으로 구현해보기.

    public static int length(ListNode list) {

        if (list == null) {
            return 0;
        }
        return 1 + length(list.next);
    }

    public static ListNode insertAfter(ListNode list, String s, String given) {
        if (list == null) {
            return null;
        } else if (list.info.equals(given)) {
            ListNode newNode = new ListNode(s);
            newNode.next = list.next;
            list.next = newNode;
        }
        list.next = insertAfter(list.next, s, given);
        return list;

    }

    public static ListNode insertBefore(ListNode list, String s, String given) {
        if (list == null) {
            return null;
        } else if (list.info.equals(given)) {
            ListNode newNode = new ListNode(s);
            newNode.next = list;
            return newNode;
        }
        list.next = insertBefore(list.next, s, given);
        return list;
    }

    public static void print(ListNode list) {
        ListNode current = list;
        while (current != null) {
            System.out.print(current.info + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static ListNode modify(ListNode list, String old, String ne) {
        if (list == null) {
            return null;
        } else if (list.info.equals(old)) {
            list.info = ne;
            return list;
        }
        list = modify(list.next, old, ne);
        return list;
    }

    public static ListNode modifyAll(ListNode list, String old, String ne) {
        if (list == null) {
            return null;
        } else if (list.info.equals(old)) {
            list.info = ne;
        }
        list = modifyAll(list.next, old, ne);
        return list;
    }

    public static ListNode copy(ListNode list) {

        if (list == null) {
            return null;
        }

        ListNode newNode = new ListNode(list.info);
        newNode.next = copy(list.next);

        return newNode;

    }

    public static ListNode invert(ListNode list) {

        if (list == null || list.next == null) {
            return list;
        }

        ListNode nextNode = list.next;
        list.next = null;
        ListNode revList = invert(nextNode);

        nextNode.next = list;
        return revList;
    }

    public static void main(String[] args) {
        ListNode orign = new ListNode("a");
        orign.next = new ListNode("b");
        orign.next.next = new ListNode("c");

        System.out.print("Orign list : ");
        print(orign);
        System.out.println();

        // System.out.println("lenght " + length(orign));

        // System.out.print("After : ");
        // insertAfter(orign, "x", "b");
        // print(orign);

        // System.out.print("Before : ");
        // insertBefore(orign, "x", "b");
        // print(orign);

        // System.out.print("modify : ");
        // modify(orign, "a", "new one");
        // print(orign);

        // System.out.print("modifyAll : ");
        // modifyAll(orign, "a", "new one");
        // print(orign);

        // System.out.print("Copy list : ");
        // copy(orign);
        // print(orign);

        System.out.print("Invert list : ");
        ListNode invertList = invert(orign);
        print(invertList);

    }
}