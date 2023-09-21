package Chapter6.채현명;

public class Ex11 {
    public static void main(String[] args) {
        System.out.println(isprime(4));
    }

    public static boolean isprime(int inputNumber) {
        if (inputNumber <= 0) {
            throw new IllegalArgumentException("음수는 가능하지 않습니다.");
        }

        for (int i = 2; i < inputNumber; i++) {
            if (inputNumber % i == 0) {
                return false;
            }
        }
        return true;
    }

}
