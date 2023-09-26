package Chapter8.Minseok;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Exercise9 {
    private int[][] matrix;
    private int rows;
    private int columns;

    public Exercise9(int rows, int col) {
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

    public static Exercise9 read(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        int rows = Integer.parseInt(br.readLine());
        int columns = Integer.parseInt(br.readLine());

        Exercise9 matrix = new Exercise9(rows, columns);

        for (int i = 0; i < rows; i++) {
            String[] values = br.readLine().split(" ");
            for (int j = 0; j < columns; j++) {
                matrix.matrix[i][j] = Integer.parseInt(values[j]);
            }
        }
        return matrix;
    }

    public Exercise9 sum(Exercise9 m) {
        Exercise9 result = new Exercise9(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.matrix[i][j] = this.matrix[i][j] + m.matrix[i][j];
            }
        }
        return result;
    }

    public Exercise9 product(Exercise9 m) {
        Exercise9 result = new Exercise9(this.rows, m.columns);
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
