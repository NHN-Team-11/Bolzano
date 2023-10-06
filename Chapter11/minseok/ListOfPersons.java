package Chapter11.minseok;

import java.io.PrintStream;

public class ListOfPersons {

    private Person a;

    public void add(Person p) {
        if (a == null) {
            a = new Person(p.getName(), p.getSurname(), p.getAge(), p.getCity());
        }
        Person current = a;
        while (current.next != null) {
            current = current.next;
        }

        current.setNext(new Person(p.getName(), p.getSurname(), p.getAge(), p.getCity()));
    }

    public Person delete(String name) {
        Person current = a;

        Person p = new Person();
        p.next = current;
        current = p;

        boolean found = false;

        while ((p.next != null) && !found) {
            if (p.next.getName().equals(name)) {
                p.next = p.next.next;
                found = true;
            } else {
                p = p.next;
            }
        }
        return a.next;
    }

    // 이름만 바꿀경우 수정
    public Person modifyName(Person p, String old, String ne) {
        while (p != null) {
            if (p.getName().equals(old)) {
                p.name = ne;
            }
            p = p.next;
        }
        return p;
    }

    public void printPerson(PrintStream ps) {
        Person current = a;
        while (current != null) {
            ps.printf("이름 : " + current.getName() + " 성 : " + current.getSurname() + " 나이 : " + current.getAge()
                    + " 거주 도시 : " + current.getCity());
            ps.println();
        }
    }

    public int countCity(String city) {
        Person current = a;
        int count = 0;
        while (current != null) {
            if (current.getCity().equals(city)) {
                count++;
            }
        }
        return count;
    }

    public int size() {
        Person current = a;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public double ageAverage() {
        int sum = 0;
        Person current = a;
        while (current != null) {
            sum += current.getAge();
        }
        return sum / size();
    }

    public Person getA() {
        return a;
    }

}
