public class ListOfPersons {

    public static PersonNode create3Person() {
        PersonNode a = new PersonNode();
        PersonNode b = new PersonNode();
        PersonNode c = new PersonNode();
        Person aP = new Person();
        Person bP = new Person();
        Person cP = new Person();
        aP.name = "재준";
        aP.surname = "하";
        aP.age = 25;
        aP.city = "광주";
        a.Person = aP;
        a.next = b;

        bP.name = "민석";
        bP.surname = "김";
        bP.age = 25;
        bP.city = "곡성";
        b.Person = bP;
        b.next = c;

        cP.name = "현명";
        cP.surname = "채";
        cP.age = 25;
        cP.city = "군산";
        c.Person = cP;
        c.next = null;

        return a;
    }

    public static PersonNode insertion(PersonNode lis, PersonNode newNode) {
        PersonNode p = new PersonNode();

        p.next = lis;
        lis = p;

        while (p.next != null) {
            p = p.next;
        }
        p.next = newNode;
        newNode.next = null;

        return lis.next;

    }

    public static PersonNode deletion(PersonNode lis, String name) {
        PersonNode p = new PersonNode();
        p.next = lis;
        lis = p;
        while (p.next != null) {
            if (p.next.Person.name.equals(name)) {
                p.next = p.next.next;
            }
            p = p.next;
        }
        return lis.next;
    }

    public static void printPerson(PersonNode lis) {
        int count = 1;
        while (lis != null) {
            System.out.print(count + "번 사람:");
            System.out.print(lis.Person.surname);
            System.out.print(lis.Person.name);
            System.out.print(" 나이: " + lis.Person.age);
            System.out.println(" 사는 곳: " + lis.Person.city);
            count++;
            lis = lis.next;
        }
    }

    public static int countCity(PersonNode lis, String city) {
        int count = 0;
        while (lis != null) {
            if (lis.Person.city.equals(city)) {
                count++;
            }
            lis = lis.next;
        }
        return count;
    }

    public static double averageAge(PersonNode lis) {
        double sum = 0;
        int num = 0;
        while (lis != null) {
            sum += lis.Person.age;
            lis = lis.next;
            num++;
        }
        return sum / num;
    }

    public static void main(String[] args) {
        PersonNode lis = create3Person();
        printPerson(lis);
        PersonNode newNode = new PersonNode();
        Person nP = new Person();
        nP.name = "중민";
        nP.surname = "이";
        nP.age = 25;
        nP.city = "목포";
        newNode.Person = nP;
        newNode.next = null;
        insertion(lis, newNode);
        // System.out.println("-------------------------");
        // printPerson(lis);
        deletion(lis, "현명");
        System.out.println("-------------------------");
        printPerson(lis);
        System.out.println(countCity(lis, "목포"));
        System.out.println(averageAge(lis));

    }

}
