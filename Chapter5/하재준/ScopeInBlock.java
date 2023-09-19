public class ScopeInBlock {
    public static void main(String[] args) {
        String a = "Hello";
        int i = 1;
        {
            System.out.println(a);
            {
                double r = 5.5;
                i = i + 1;
                System.out.println(r);
            }
            // System.out.println(r);
            System.out.println(i);
            {
                int r = 4;
                System.out.println(a);
            }
        }
        i = i + 1;
        System.out.println(i);
    }
}
