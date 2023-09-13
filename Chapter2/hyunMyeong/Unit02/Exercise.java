package hyunMyeong.Unit02;

public class Exercise {
    public static void main(String[] args) {

        String a = "name";
        String b = "name";
        String c = new String("name");
        System.out.println(a.equals(b));

        // System.out.println(a == b);
        // System.out.println(a == c);
        // System.out.println(a.substring(0, 1) == b.substring(0, 1));
        // System.out.println(a.substring(0, 1) == c.substring(0, 1));

        /*
         * Exercise 2.2 / 2.4 => adoc파일
         * 
         * Exercise 2.1
         * String name = "ChaeHyunMyeong"; // Exercise 2.1 = > C 와 g를 출력하는것.
         * System.out.println(name.substring(0, 1).concat(name.substring(name.length() -
         * 1)));
         */

        /*
         * Exercise 2.4
         * String name = "채현명";
         * System.out.println(name.substring(2).concat(name.substring(1,
         * 2).concat(name.substring(0, 1))));
         */

        /*
         * Exercise 2.5
         * String name = "채현명";
         * StringBuffer bf = new StringBuffer();
         * bf.replace(0, 1, name.substring(2)).append(name.substring(1,
         * 2)).append(name.substring(0, 1));
         * 
         * System.out.println(bf.toString());
         */

    }
}