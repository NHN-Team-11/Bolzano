package Chapter7.Minseook;

public class Example4 {
    public static void invertArray(int[] v) {
        for (int i = 0; i < v.length / 2; i++) {
            int temp = v[i];
            v[i] = v[v.length - 1 - i];
            v[v.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] x = { 5, 3, 9, 5, 12 };

        for (int i = 0; i < 5; i++) {
            System.out.println(x[i]);
        }
        invertArray(x);
        for (int i = 0; i < 5; i++) {
            System.out.println(x[i]);
        }
    }

    // 배열 x가 invertArray 메소드에 실제 매개변수로 전달될 때 형식 매개변수 v는 x가
    // 참조하는 것과 동일한 배열 객체를 참조합니다 . 따라서 메서드 내부의 배열에 대한 모든 수정 사항은 x 가 참조하는 동일한 배열에서
    // 수행되므로 호출 메서드(이 경우 main ) 에 표시됩니다 .

}
