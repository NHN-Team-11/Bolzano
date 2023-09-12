public class Exercise02_1 {
    public static void main(String[] args) {
        
        String name = "하재준";
        StringBuffer sb = new StringBuffer(name);
        sb.replace(0, 1, name.substring(2, 3));
        sb.replace(2, 3, name.substring(0, 1));
        System.out.println(sb);
    //     System.out.println(name.substring(0,1)+ name.substring(2,3));
    // name.
    }
}
