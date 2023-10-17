package Chapter11.채현명;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Ex3 {

    public static boolean isOrdered(ListNode list) {
        while (list != null && list.next != null) {
            if (list.val > list.next.val)
                return false;
            list = list.next;
        }
        return true;
    }

    public static boolean search(ListNode head, int target) {
        while (head != null) {
            if (head.val == target) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public static ListNode insert(ListNode list, int number) { // 리스트 탐색,
        ListNode newNode = new ListNode(number);

        if (list == null || list.val >= number) {
            newNode.next = list;
            return newNode;
        }
        ListNode current = list;
        while (current.next != null && current.next.val < number) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;

        return list;

    }

    public static ListNode delete(ListNode head, int target) {
        if (head == null) {
            return null;
        }

        if (head.val == target) {
            return head.next;
        }

        ListNode current = head;
        while (current.next != null && current.next.val != target) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }

        return head;
    }

    public static ListNode merge(ListNode list1, ListNode list2) {
        ListNode mergedHead = new ListNode(0);
        ListNode current = mergedHead;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                current.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        }

        if (list2 != null) {
            current.next = list2;
        }

        return mergedHead.next;
    }

    public static ListNode intersection(ListNode list1, ListNode list2) {
        ListNode intersectedHead = new ListNode(0);
        ListNode current = intersectedHead;

        while (list1 != null && list2 != null) {
            if (list1.val == list2.val) {
                current.next = new ListNode(list1.val);
                list1 = list1.next;
                list2 = list2.next;
                current = current.next;
            } else if (list1.val < list2.val) {
                list1 = list1.next;
            } else {
                list2 = list2.next;
            }
        }

        return intersectedHead.next;
    }

    public static void printList(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        System.out.print("List 1: ");
        printList(list1);

        System.out.print("List 2: ");
        printList(list2);

        // System.out.println("Is List 1 ordered? " + isOrdered(list1));
        // System.out.println("Is List 2 ordered? " + isOrdered(list2));

        // int target = 3;
        // System.out.println("Search for " + target + " in List 1: " + search(list1,
        // target));
        // System.out.println("Search for " + target + " in List 2: " + search(list2,
        // target));

        int newValue = 4;
        list1 = insert(list1, newValue);
        System.out.println("Insert " + newValue + " into List 1:");
        printList(list1);

        // target = 3;
        // list1 = delete(list1, target);
        // System.out.println("Delete " + target + " from List 1:");
        // printList(list1);

        // System.out.println("Merge List 1 and List 2:");
        // ListNode merged = merge(list1, list2);
        // printList(merged);

    }
}
