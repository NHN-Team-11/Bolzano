package ColaboExercise.Chap8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Matrix {
    private int[][] matrix;
    private int n;
    private int m;
    public Matrix (int n, int m) {
        this.n = n;
        this.m = m;
        this.matrix = new int [n][m];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = 0;
            }
        }
    }

    public void save(String fileName) throws IOException {

        PrintWriter writer = new PrintWriter(new FileWriter(fileName, true));
        writer.println(n);
        writer.println(m);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                writer.print(matrix[i][j] + " ");
            }
            writer.println();
        }
        writer.close();

    }

    public static Matrix read(String fileName) throws IOException {
        
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        Matrix result = new Matrix(n, m);

        for (int i = 0; i < result.n; i++) {
            String[] arr = br.readLine().split(" ");
            for (int j = 0; j < result.m; j++) {
                result.matrix[i][j] = Integer.parseInt(arr[j]);
            }
        }
        br.close();
        return result;

    }

    public Matrix sum(Matrix m) {

        Matrix result = new Matrix(this.matrix.length, this.matrix[0].length);
        if(this.matrix.length != m.matrix.length || this.matrix[0].length != m.matrix.length){
            return null;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result.matrix[i][j] = this.matrix[i][j] + m.matrix[i][j];
            }
        }
        return result;
    }

    public Matrix product(Matrix m) {

        Matrix result = new Matrix(this.matrix.length, this.matrix[0].length);
        if(this.matrix.length != m.matrix.length || this.matrix[0].length != m.matrix.length){
            return null;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result.matrix[i][j] = this.matrix[i][j] * m.matrix[i][j];
            }
        }
        return result;
    }
    

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Arrays.toString(matrix));
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {

        Matrix matrix = new Matrix(3, 3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix.matrix[i][j] = i * 3 + j + 1;
            }
        }
        Matrix matrix2 = new Matrix(3, 3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2.matrix[i][j] = i * 3 + j + 1;
            }
        }
        Matrix result2 = matrix.sum(matrix2); 
        result2.save("matrix2.txt");
        Matrix result = matrix.product(matrix2);
        result.save("matrix.txt");
        
        System.out.println("행렬을 파일에 저장했습니다.");

    }

    
}
