package Chapter11.이중민;

import java.io.PrintStream;

public class ListOfPersons<T extends Person> implements List<T> {

    private Person head;

    @Override
    public void add(T p) {
        if(head == null) {
            head = new Person(p.getName(), p.getSurName(), 
            p.getAge(), p.getResidence());
        }
        else {
            Person current = head;
            while(current.nextNode() != null) {
                current = current.nextNode();
            }

            current.setNext(new Person(p.getName(), p.getSurName(), 
            p.getAge(), p.getResidence()));
        }
    }
    
    @Override
    public void delete(String name) {
        Person current = head;

        Person p = new Person();
        p.setNext(current);
        current = p;

        while(p.nextNode() != null) {
            if(p.nextNode().getName().equals(name)) {
                p.setNext(p.nextNode().nextNode());
            }   
            else {
                p = p.nextNode();
            }
        }
    }
    

    @Override
    public int size() {
        int count = 0;
        Person current = head;
        while(current != null) {
            count++;
            current = current.nextNode();
        }
        return count;
    }

    

    @Override
    public void print(Person person, PrintStream ps) {
        Person current = person;
        while(current != null) {
            ps.print("이름: " + current.getName() + " | 성: " + current.getSurName() + " | 나이: " + 
                    current.getAge() + " | 주소: " + current.getResidence());
            ps.println();

            current = current.nextNode();
        }
    }

    public int ageAverage() {
        Person current = head;
        int sum = 0;
        
        while(current != null) {
            sum += current.getAge();
            current = current.nextNode();
        }
        return sum / size();
    }

    public int residencePeoplesize(String residence) {
        int count = 0;
        Person current = head;
        while(current != null) {
            if(current.getResidence().equals(residence)){
                count++;
            }
            current = current.nextNode();
        }
        return count;
    }

    public Person getHead() {
        return head;
    }

    public static void main(String[] args) {
        Person person = new Person("Jung Min", "Lee", 25, "Mok po");
        Person person2 = new Person("Youn Ho", "Kim", 24, "Mok po");
        Person person3 = new Person("Hyun Myeong", "Chae", 23, "Gun san");
        ListOfPersons<Person> listOfPersons = new ListOfPersons<>();
        listOfPersons.add(person);
        listOfPersons.add(person2);
        listOfPersons.add(person3);
        
        Person person4 = new Person("null", "null", 0, "null");
        listOfPersons.add(person4);
        
        listOfPersons.delete("null");
        System.out.println(listOfPersons.residencePeoplesize("Mok po"));
        System.out.println(listOfPersons.ageAverage());
        listOfPersons.print(listOfPersons.head, System.out);
    }

    
}