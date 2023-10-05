package Chapter11.이중민;

import java.io.PrintStream;


interface List<E> {
    void add(E e);
    boolean remove(E e);
    boolean contains(E e);
}

class Node<T> {
    T data;
    Node<T> nextNode;

    public Node(T data) {
        this.data = data;
        this.nextNode = null;
    }

    public Node<T> nextNode() {
        return this.nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }
}

public class Exercise1<T> implements List<T> {
    Node<T> node;

    public void add(T e) {
        if (node.nextNode() == null) {
            this.node = new Node<T>(e);
        }
        else {
            this.node.setNextNode(new Node<T>(e));
        }
    }
    
    public static void print(ListNode lis, PrintStream ps) {
        while (lis != null) {
            ps.print(lis.info + " ");
            lis = lis.next;
        }
        ps.println();
    }
    public static int length(ListNode lis) {
        int count = 0;

        while(lis != null) {
            count++;
            lis = lis.next;
        }
        return count;
    }

    public static ListNode insertAfter(ListNode lis, String s, String given) {

        // ListNode p = new ListNode();
        // p.next = lis;
        // lis = p;

        // ListNode newNode = new ListNode();
        // newNode.info = given;

        // while(p.next != null) {
        //     if(p.next.info.equals(s)) {
        //         newNode.next = p.next.next;
        //         p.next.next = newNode;
                
        //     }
        //     p = p.next;
        // }
        // return lis.next;
        ListNode newNode = new ListNode();
        newNode.info = given;

        while(lis != null) {
            if(lis.info.equals(s)) {
                newNode.next = lis.next;
                lis.next = newNode;
            }
            lis = lis.next;
        }
        return lis;
    }

    public static ListNode insertBefore(ListNode lis, String s, String given) {

        // ListNode p = new ListNode();
        // p.next = lis;
        // lis = p;

        // ListNode newNode = new ListNode();
        // newNode.info = given;

        // while(p.next != null) {
        //     if(p.next.info.equals(s)) {
        //         newNode.next = p.next;
        //         p.next = newNode;
        //         break;
        //     }
        //     p = p.next;
        // }
        // return lis.next;

        ListNode newNode = new ListNode();
        newNode.info = given;
        
        while(lis != null) {
            if(lis.next.info.equals(s)) {
                newNode.next = lis.next;
                lis.next = newNode;
                break;
            }
            lis = lis.next;
        }
        return lis;
    }

    public static ListNode modify(ListNode lis, String old, String ne) {
        ListNode p = new ListNode();
        p.next = lis;
        lis = p;

        if(lis.next == null) {
            return lis;
        }
        boolean check = false;
        while((p.next != null) && !check) {
            if(p.next.info.equals(old)) {
                p.next.info = ne;
                check = true;
            }
            p = p.next;
        }
        return lis.next;
    }

    public static ListNode modifyAll(ListNode lis, String old, String ne) {
        ListNode p = new ListNode();
        p.next = lis;
        lis = p;
        if(lis.next == null) {
            return lis;
        }

        while(p.next != null) {
            if(p.next.info.equals(old)) {
                p.next.info = ne;
            }
            p = p.next;
        }
        return lis.next;
    }
    //모르겠음
    public static ListNode copy(ListNode lis) {
        
        ListNode next = new ListNode();
        ListNode newList = next;
        
        
        while(lis != null) {
            ListNode newNode = new ListNode();
            newNode.num = lis.num;
            newList.next = newNode;

            newList = newNode;
            lis = lis.next;
        }
        
        return next.next;
    }
    //모르겟음
    public static ListNode invert(ListNode lis) {
        ListNode temp;
        ListNode newList = null;
        while(lis != null) {
            temp = lis.next;
            lis.next = newList;
            newList = lis;
            lis = temp;
        }
        return newList;
    }

    public static ListNode deleteDoubles(ListNode lis) {
        ListNode p = new ListNode();
        p.next = lis;
        lis = p;

        ListNode deleteNode = new ListNode();
        deleteNode.info = p.next.info;
        
        while(p.next != null) {
            p = p.next;
            if(deleteNode.info.equals(p.next.info)) {
                p.next = p.next.next;
            }
        }
        return lis.next;
    }

    public static boolean searchSequence(ListNode lis1, ListNode lis2) {
        String lis1Str = "";
        String lis2Str = "";
        while(lis1 != null) {
            lis1Str += lis1.info;
            lis1 = lis1.next;
        }
        System.out.println(lis1Str);
        while(lis2 != null) {
            lis2Str += lis2.info;
            lis2 = lis2.next;
        }

        for (int i = 0; i < lis1Str.length() - lis2Str.length(); i++) {
            if(lis1Str.substring(i, i + lis2Str.length()).equals(lis2Str)) {
                return true;
            }
        }
        return false;
    }

    public static ListNode create3NodesABC() {
        ListNode a = new ListNode();
        ListNode b = new ListNode();
        ListNode c = new ListNode();
        a.info = "A";
        a.next = b;
        b.info = "B";
        b.next = c;
        c.info = "C";
        c.next = null;
        return a;
    }

    public static ListNode create3NodesABC2() {
        ListNode a = new ListNode(); //generator node
        ListNode b = new ListNode();
        ListNode c = new ListNode();
        ListNode d = new ListNode();

        
        a.info = "A";
        a.next = b;
        b.info = "B";
        b.next = c;
        c.info = "B";
        c.next = d;
        d.info = "C";
        d.next = null;
        return a;
    }

    public static void main(String[] args) {
        PrintStream ps = System.out; 
        ListNode lis = create3NodesABC();
        // ListNode lis2 = create3NodesABC();
        insertAfter(lis, "B", "D");
        // modify(lis, "A", "C");
        // modifyAll(lis, "C", "A");
        insertBefore(lis, "B", "C");
        print(lis, ps);
        print(copy(lis), ps);
        print(invert(lis), ps);
        // print(deleteDoubles(lis), ps);
        // System.out.println(searchSequence(lis, lis2));
        // System.out.println(Exercise2.searchSequence(lis, lis2));
        // System.out.println(length(lis));

    }

    @Override
    public boolean remove(T e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public boolean contains(T e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }
}