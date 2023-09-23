public class Main {

    public static int[] matrixSumRows(int[][] M) {
        int[] result = new int[M.length];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < result.length; j++) {
                result[i] += M[i][j];
            }
        }

        return result;
    }

    public static double[][] matrixProduct(double[][] A, double[][] B) {
        double[][] C = new double[A.length][A[0].length];
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                C[i][j] = A[i][j] * B[i][j];

            }
        }
        return C;
    }

    public static double[][] matrixSum(double[][] A, double[][] B) {
        double[][] C = new double[A.length][A[0].length];
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    public static void printMatrixRows(short[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
    }

    public static void printMatrixColumns(short[][] m) {
        for (int i = 0; i < m[0].length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[j][i]);
            }
            System.out.println();
        }
    }

    public static int sumArrayValues(int[] v) {
        int sum = 0;
        for (int i = 0; i < v.length; i++) {
            sum += v[i];
        }
        return sum;
    }

    public static boolean searchArray(String[] v, String e) {
        for (int i = 0; i < v.length; i++) {
            if (e.equals(v[i])) {
                return true;
            }
        }
        return false;
    }

    public static void invertArray(int[] v) {
        for (int i = 0; i < v.length / 2; i++) {
            int temp;
            temp = v[i];
            v[i] = v[v.length - i - 1];
            v[v.length - i - 1] = temp;
        }
    }

    public static long maxArray(long[] v) {
        long max = v[0];
        for (int i = 0; i < v.length; i++) {
            if (max < v[i]) {
                max = v[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // int[] v = { 4, 2, 3 };
        // System.out.println(sumArrayValues(v));
        // String[] x = { "one", "two", "three" };
        // System.out.println(searchArray(x, "two"));
        // int[] v = { 23, 52, 60, 31, 17, 42 };
        // invertArray(v);
        // for (int i = 0; i < v.length; i++) {
        // System.out.print(v[i] + " ");
        // }
        // for (int i = 0; i < args.length; i++) {
        // System.out.println(args[i]);
        // }

        // int[][] m = new int[3][5];
        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 5; j++) {
        // System.out.print(m[i][j] + " ");
        // }
        // System.out.println();
        // }

        // int[][] m2 = {
        // { 1, 3, 4, 1, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 33, 3, 2,
        // 21, 1, 1, 1, 1, 2, 2, 2 },
        // { 1, 2, 5, 1, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 33, 3, 2,
        // 21, 1, 1, 1, 1, 2, 2, 2 }
        // };
        // System.out.println(m2.length);
        // System.out.println(m2[1].length);
        // short[][] A = {
        // { 1, 2, 2 },
        // { 7, 5, 9 }
        // };
        // printMatrixColumns(A);
        // System.out.println();
        // printMatrixRows(A);
        // double[][] A = {
        // { 1.2, 2.3, 2.3 },
        // { 7.4, 5.1, 9.8 }
        // };
        // double[][] B = {
        // { 5.0, 4.0, 1.3 },
        // { 1.2, 0.3, 3.2 }
        // };
        // double[][] C = matrixSum(A, B);
        // System.out.println(C[1][0]);
        // double[][] A = { // creates matrix A of dimension 3x3
        // { 1.0, 2.0, 2.0 },
        // { 7.0, 5.0, 9.0 },
        // { 3.0, 0.0, 6.0 }
        // };
        // double[][] B = { // creates matrix B of dimension 3x3
        // { 5.0, 4.0, 1.0 },
        // { 1.0, 0.0, 3.0 },
        // { 7.0, 5.0, 2.0 }
        // };
        // double[][] C = matrixProduct(A, B); // calculates the product A*B
        // System.out.println(C[1][0]);
        int[][] A = { // creates matrix A of dimension 3x3
                { 1, 2, 2 },
                { 7, 5, 9 },
                { 3, 0, 6 }
        };
        int[] B = matrixSumRows(A);
        for (int i = 0; i < B.length; i++)
            System.out.print(B[i] + " "); // prints out the array B
        System.out.println();
    }

}