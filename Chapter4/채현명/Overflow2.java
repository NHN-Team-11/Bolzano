package Chapter4.채현명;

/*
 * 2번, 3번 
 */
public class Overflow2 {
    public static boolean sumOverFlow(byte x, byte y) {
        short sum = (short) (x + y);

        if (sum > Byte.MAX_VALUE) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        //문제 4.2
        System.out.println(sumOverFlow((byte) 126, (byte) 127));

        // 연습문제 4.3
        System.out.println("산술평균 =" + (10 + 20) / 2);
        System.out.println("Math.pow = " + Math.pow(2, 2));
        System.out.println("Math.max and Math.min " + Math.max(10, 2) + "and" + Math.min(4, 9));
    
        
    
    }
}
