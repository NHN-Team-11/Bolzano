package Chapter11.minseok;

public class Person {
    private String name;
    private String surname;
    private int age;
    private String city;

    // public Person(String name, String surname, int age, String city) {
    // this.name = name;
    // this.surname = surname;
    // this.age = age;
    // this.city = city;
    // }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
