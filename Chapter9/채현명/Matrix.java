package Chapter9.채현명;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ExceptionWrongMatrixValues extends Exception {
    public ExceptionWrongMatrixValues(String message) {
        super(message);
    }
}

class ExceptionWrongMatrixDimension extends Exception {
    public ExceptionWrongMatrixDimension(String message) {
        super(message);
    }
}

public class Matrix {
    private int[][] data;

    public Matrix() {
        this.data = null;
    }

    public void read(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int row = 0;
            int numRows = 0;
            int numCols = -1;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(" ");
                int cols = values.length;

                if (numCols == -1) {
                    numCols = cols;
                } else if (numCols != cols) {
                    throw new ExceptionWrongMatrixValues("Data has inconsistent row lengths");
                }

                if (data == null) {
                    numRows = 1;
                    data = new int[numRows][numCols];
                } else if (row >= numRows) {
                    numRows++;
                    int[][] newData = new int[numRows][numCols];
                    System.arraycopy(data, 0, newData, 0, data.length);
                    data = newData;
                }

                for (int col = 0; col < numCols; col++) {
                    try {
                        data[row][col] = Integer.parseInt(values[col]);
                    } catch (NumberFormatException e) {
                        throw new ExceptionWrongMatrixValues("Data does not correspond to numeric values");
                    }
                }

                row++;
            }

            if (row != numRows) {
                throw new ExceptionWrongMatrixDimension("Data does not correspond to the dimension of the matrix");
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        } catch (ExceptionWrongMatrixValues | ExceptionWrongMatrixDimension e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.read("matrix.txt");
    }
}
