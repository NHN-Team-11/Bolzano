package Chapter11.minseok;

public class ListOfPersons {

    private Person[] a;

    private int n;

    public ListOfPersons() {
        a = new Person[10];
        n = 0;
    }

    // Add a person to the List of Persons in the last position
    public void add(Person p) {
        if (n == a.length) {
            Person[] b = new Person[a.length * 2];
            for (int i = 0; i < a.length; i++)
                b[i] = a[i];
            a = b;
        }
        // Now we are sure that n < a.length
        a[n] = p;
        n++;
    }

    // Remove the person in position k
    public void remove(int k) {
        if ((k >= 0) && (k < n)) {
            // We have to move all elements that follow k
            for (int i = k; i < n; i++)
                a[i] = a[i + 1];
            n--;
        }
        // We reduce the dimension of the array if it is sufficiently empty
        if ((a.length > 10) && (n < a.length / 4)) {
            Person[] b = new Person[a.length / 2];
            for (int i = 0; i < n; i++)
                b[i] = a[i];
            a = b;
        }
    }

    public void printPerson() {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a);
        }
    }

    public int countCity(String s) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].getCity().equals(s)) {
                count++;
            }
        }
        return count;
    }

    public double averAge() {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i].getAge();
        }

        return (double) sum / a.length;
    }

    public Person[] getA() {
        return a;
    }

    public int getN() {
        return n;
    }

    public String getPersonName(int k) {
        if (k >= 0 && k < n) {
            return a[k].getName(); // 이름을 반환
        } else {
            return null; // 잘못된 인덱스면 null 반환
        }
    }

}
