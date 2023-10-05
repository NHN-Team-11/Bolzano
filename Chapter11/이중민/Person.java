package Chapter11.이중민;

public class Person {
    private Person nextNode;
    private String name;
    private String surName;
    private int age;
    private String residence;
    public Person() {}
    public Person(String name, String surName, int age, String residence) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.residence = residence;
        this.nextNode = null;
    }

    public Person nextNode() {
        return this.nextNode;
    }

    public void setNext(Person nextNode) {
        this.nextNode = nextNode;
    }

    public Person getNextNode() {
        return nextNode;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public String getResidence() {
        return residence;
    }
    
}
