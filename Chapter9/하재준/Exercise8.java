import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercise8 {
    private int[][] matrix;
    private int rows;
    private int columns;

    public Exercise8(int rows, int col) {
        this.rows = rows;
        this.columns = col;
        matrix = new int[rows][col];
    }

    public void save(String filename) throws IOException {
        PrintWriter pw = new PrintWriter(filename);
        pw.println(rows);
        pw.println(columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                pw.print(matrix[i][j] + " ");
            }
            pw.println();
        }
    }

    public static Exercise8 read(String filename) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        int rows = Integer.parseInt(br.readLine());
        int columns = Integer.parseInt(br.readLine());

        Exercise8 matrix = new Exercise8(rows, columns);

        for (int i = 0; i < rows; i++) {
            String[] values = br.readLine().split(" ");
            if (values.length != columns) {
                throw new Exception("ExceptionWrongMatrixDimensiong");
            }
            for (int j = 0; j < columns; j++) {
                try {
                    matrix.matrix[i][j] = Integer.parseInt(values[j]);
                } catch (NumberFormatException e) {
                    throw new Exception("ExceptionWrongMatrixValues");
                }
            }
        }
        return matrix;
    }

    public Exercise8 sum(Exercise8 m) {
        Exercise8 result = new Exercise8(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.matrix[i][j] = this.matrix[i][j] + m.matrix[i][j];
            }
        }
        return result;
    }

    public Exercise8 product(Exercise8 m) {
        Exercise8 result = new Exercise8(this.rows, m.columns);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < m.columns; j++) {
                int sum = 0;
                for (int k = 0; k < this.columns; k++) {
                    sum += this.matrix[i][k] * m.matrix[k][j];
                }
                result.matrix[i][j] = sum;
            }
        }

        return result;
    }

}
