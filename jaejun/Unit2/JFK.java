public class JFK {
    public static void main(String[] args) {
        String first = "John";
        String middle = "Fitzgerald";
        String last = "Kennedy";
        String initials;
        // String firstInit, middleInit, lastInit;
        // firstInit = first.substring(0, 1);
        // middleInit = middle.substring(0, 1);
        // lastInit = last.substring(0, 1);
        // initials = firstInit.concat(middleInit);
        // initials = initials.concat(lastInit);
        // System.out.println(initials);
        initials = first.substring(0, 1) + middle.substring(0, 1) + last.substring(0, 1);
        System.out.println(initials);
        String s1 = new String("test1");
        String s2 = new String("test2");
        s1 = s2;
        System.out.println(s1==s2);
        System.out.println(s1);
        System.out.println(s2);

    }
}
