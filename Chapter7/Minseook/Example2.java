package Chapter7.Minseook;

public class Example2 {

    public static boolean searchArray(String[] v, String s) {
        for (int i = 0; i < v.length; i++) {
            if (s.equals(v[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] x = { "one", "two", "three" };

        if (searchArray(x, "two")) {
            System.out.println("present");
        } else {
            System.out.println("not present");
        }
    }

}
