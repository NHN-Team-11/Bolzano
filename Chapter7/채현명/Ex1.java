package Chapter7.채현명;

public class Ex1 {

    public static double mat(double[] matrix1, double[] matrix2) {
        double sum = 0;
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++)
                sum += matrix1[i] * matrix2[j];
        }
        return sum;
    }

    public static void main(String[] args) {
        double[] matrix1 = { 1.0, 2.0 };
        double[] matrix2 = { 3.0, 1.0 };

        System.out.println(mat(matrix1, matrix2));

    }
}
