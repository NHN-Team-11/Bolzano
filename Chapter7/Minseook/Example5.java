package Chapter7.Minseook;

public class Example5 {
    public static void printMatrixRows(short[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printMatrixColumns(short[][] m) {
        for (int i = 0; i < m[0].length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        short[][] A = {
                { 1, 2, 2 },
                { 7, 5, 9 }
        };

        printMatrixRows(A);
        System.out.println();
        printMatrixColumns(A);
    }

}
