// package Chapter11.채현명;

// class ListNode {
// String data;
// ListNode next;

// public ListNode(String data) {
// this.data = data;
// this.next = null;
// }
// }

// public class new {

// public static int length(ListNode lis) {
// int count = 0;
// while (lis != null) {
// count++;
// lis = lis.next;
// }
// return count;
// }

// public static ListNode insertAfter(ListNode lis, String s, String given) {
// ListNode head = lis;
// while (lis != null) {
// if (lis.data.equals(given)) {
// ListNode newNode = new ListNode(s);
// newNode.next = lis.next;
// lis.next = newNode;
// break;
// }
// lis = lis.next;
// }
// return head;
// }

// public static ListNode modify(ListNode lis, String old, String ne) {
// ListNode head = lis;
// while (lis != null) {
// if (lis.data.equals(old)) {
// lis.data = ne;
// break;
// }
// lis = lis.next;
// }
// return head;
// }

// public static ListNode modifyAll(ListNode lis, String old, String ne) {
// ListNode head = lis;
// while (lis != null) {
// if (lis.data.equals(old)) {
// lis.data = ne;
// }
// lis = lis.next;
// }
// return head;
// }

// public static ListNode insertBefore(ListNode lis, String s, String given) {
// ListNode head = lis;
// ListNode prev = null;
// while (lis != null) {
// if (lis.data.equals(given)) {
// ListNode newNode = new ListNode(s);
// if (prev != null) {
// prev.next = newNode;
// } else {
// head = newNode;
// }
// newNode.next = lis;
// break;
// }
// prev = lis;
// lis = lis.next;
// }
// return head;
// }

// public static ListNode copy(ListNode lis) {
// ListNode head = null;
// ListNode tail = null;
// while (lis != null) {
// ListNode newNode = new ListNode(lis.data);
// if (tail == null) {
// head = newNode;
// tail = newNode;
// } else {
// tail.next = newNode;
// tail = newNode;
// }
// lis = lis.next;
// }
// return head;
// }

// public static ListNode invert(ListNode lis) {
// ListNode prev = null;
// ListNode current = lis;
// ListNode next = null;
// while (current != null) {
// next = current.next;
// current.next = prev;
// prev = current;
// current = next;
// }
// return prev;
// }

// public static ListNode deleteDoubles(ListNode lis) {
// ListNode head = lis;
// while (lis != null) {
// ListNode current = lis;
// while (current.next != null && current.next.data.equals(lis.data)) {
// current.next = current.next.next;
// }
// lis = lis.next;
// }
// return head;
// }

// public static boolean searchSequence(ListNode lis1, ListNode lis2) {
// while (lis1 != null) {
// ListNode temp1 = lis1;
// ListNode temp2 = lis2;
// while (temp1 != null && temp2 != null && temp1.data.equals(temp2.data)) {
// temp1 = temp1.next;
// temp2 = temp2.next;
// }
// if (temp2 == null) {
// return true; // lis2 is a subsequence of lis1
// }
// lis1 = lis1.next;
// }
// return false;
// }
// }
