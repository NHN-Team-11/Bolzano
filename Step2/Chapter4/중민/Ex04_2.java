package Step2.Chapter4.중민;

public class Ex04_2 {
    public static void main(String[] args) throws IllegalAccessException {
        int value = 0;
        String str = "34GF";
        for (int i = 0; i < str.length(); i++) {
            if(hexValue(str.charAt(i)) == -1) {
//                throw new IllegalAccessException("16진수가 아닌 수가 들어왔습니다!");
                System.out.println(-1);
                return;
            }
            value = value * 16 + hexValue(str.charAt(i));
        }
        System.out.println(value);
    }

    private static int hexValue(char c) {
        if(!((c >= 48 && c <= 57) ||
                (c >= 65 && c <= 70) ||
                (c >= 97 && c <= 102))) {
            return -1;
        }
        return c;
    }
}
