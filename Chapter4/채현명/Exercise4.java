package Chapter4.채현명;

// 4.4번 
public class Exercise4 {
    public static boolean odd(long x) {
        if (x % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("짝수 판별 = " + odd(24));

        // 5번
        short x = 22;
        byte y = (byte) x; // byte로 캐스팅하면된다.
        System.out.println(y);
    }
}
