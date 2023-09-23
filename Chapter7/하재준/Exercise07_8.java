public class Exercise07_8 {
    public static int mystery(int[] A) { // 배열 A에 있는 홀수의 개수를 출력하는 method
        int x = 0;
        for (int i = 0; i < A.length; i++)
            if (A[i] % 2 == 1)
                x++;
        return x;
    }

    public static void main(String[] args) {
        int[] A = { 1, 5, 4, 3 };
        System.out.println(mystery(A));
    }
}
