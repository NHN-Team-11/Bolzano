package Chapter7.채현명;

import java.util.Arrays;

public class Ex2 {

    public static int[] intersection(int[] array1, int[] array2) {
        int equalCount = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j])
                    equalCount++;
            }
        }

        int[] equalArray = new int[equalCount];
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    equalArray[count] = array1[i];
                    count++;
                }
            }
        }

        return equalArray;
    }

    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3 };
        int[] array2 = { 2, 4, 3 };

        int[] result = intersection(array1, array2);
        System.out.println(Arrays.toString(result));

    }
}
