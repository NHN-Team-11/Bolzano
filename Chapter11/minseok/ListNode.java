package Chapter11.minseok;

public class ListNode {
    public String info;
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(String info) {
        this.info = info;
        this.next = null;
    }

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

}
