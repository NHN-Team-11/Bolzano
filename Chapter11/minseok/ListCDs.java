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
        CD result = null;
        CD current = head;

        while (current != null) {
            if (current.getAuthors().equals(author)) {
                if (result == null) {
                    result = new CD(current.getAuthors(), current.getTitle(), current.getYear(), current.getPrice());
                    result.next = null;
                } else {
                    CD newCD = new CD(current.getAuthors(), current.getTitle(), current.getYear(), current.getPrice());
                    newCD.next = result;
                    result = newCD;
                }
            }
            current = current.next;
        }

        return result;
    }

    public static void main(String[] args) {
        CD one = new CD("김민석", "오예스", 2023, 10000);
        CD four = new CD("이중민", "오예스", 2023, 10000);
        CD two = new CD("이중민", "오예스", 2023, 10000);
        CD three = new CD("김민석", "오예스", 2023, 10000);
        CD five = new CD("김민석", "오예스", 2023, 10000);

        ListCDs listCDs = new ListCDs();
        listCDs.add(one);
        listCDs.add(two);
        listCDs.add(three);
        listCDs.add(four);
        listCDs.add(five);
        CD result = listCDs.getAuthors("김민석");

        listCDs.printPerson(result, System.out);

    }
}