package Chapter11.minseok;

import java.io.PrintStream;

public class ListCDs {

    private CD head;

    public void add(CD cd) {
        if (head == null) {
            head = new CD(cd.getAuthors(), cd.getTitle(), cd.getYear(), cd.getPrice());
        }
        CD current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.setNext(new CD(cd.getAuthors(), cd.getTitle(), cd.getYear(), cd.getPrice()));
    }

    public CD delete(String authors) {
        CD current = head;

        CD cd = new CD();
        cd.next = current;
        current = cd;

        boolean found = false;

        while ((cd.next != null) && !found) {
            if (cd.next.getAuthors().equals(authors)) {
                cd.next = cd.next.next;
                found = true;
            } else {
                cd = cd.next;
            }
        }
        return cd.next;
    }

    public void printPerson(CD current, PrintStream ps) {
        while (current != null) {
            ps.printf("저자 : " + current.getAuthors() + " 제목 : " + current.getTitle() + " 발행 년도 : " + current.getYear()
                    + " 가격 : " + current.getPrice());
            ps.println();
            current = current.getNext();
        }
    }

    public int priceCD() {
        CD current = head;
        int price = 0;
        while (current != null) {
            price += current.getPrice();
            current = current.next;
        }
        return price;
    }

    public CD getAuthors(String author) {
        CD newCD = null;
        CD current = head;
        CD newList = null;

        while (current != null) {
            if (current.getAuthors().equals(author)) {
                if (newList == null) {
                    newCD = new CD(current.getAuthors(), current.getTitle(), current.getYear(), current.getPrice());
                    newList = newCD;
                } else {
                    newCD.next = new CD(current.getAuthors(), current.getTitle(), current.getYear(),
                            current.getPrice());
                    newCD = newCD.next;
                }
            }
            current = current.next;
        }

        return newList;
    }

    public static void main(String[] args) {
        CD one = new CD("이중민", "오예스", 2023, 10000);
        CD four = new CD("이중민", "오예스", 2023, 10000);
        CD two = new CD("김민석", "오예스", 2023, 10000);
        CD three = new CD("김민석", "오예스", 2023, 10000);

        ListCDs listCDs = new ListCDs();

        listCDs.add(one);
        listCDs.add(two);
        listCDs.add(three);
        listCDs.add(four);
        CD result = listCDs.getAuthors("이중민");

        listCDs.printPerson(result, System.out);

    }
}