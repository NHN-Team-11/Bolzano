package Chapter9.채현명;

/* 
 * runtime error, compile error 없음 : 출력값
 * 
 * I am an object of the Ex3 class
 * I am an object of the Derived class, I am an object of the Ex3 class
 * I am an object of the Derived class, I am an object of the Ex3 class
 */
public class Ex3 {
    public Ex3() {
        infob = "I am an object of the Ex3 class";
    }

    public String getInfo() {
        return infob;
    }

    private String infob;
}

class Derived extends Ex3 {

    private String infod;

    public Derived() {
        super();
        infod = "I am an object of the Derived class";
    }

    public String getInfo() {
        return infod + ", " + super.getInfo();
    }
}

class Ex3_main {
    public static void main(String[] args) {
        Ex3 b = new Ex3();
        Derived d = new Derived();
        System.out.println(b.getInfo());
        System.out.println(d.getInfo());
        b = d;
        System.out.println(b.getInfo());
    }
}