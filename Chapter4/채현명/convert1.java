package Chapter4.채현명;

public class convert1 {
    public static double convertLireEuro(int x) {
        double krw = 1423.54;
        double convertEuro = krw * x;

        return convertEuro;
    }

    public static void main(String[] args) {
        
        System.out.println("변환된 값 : " + convertLireEuro(200) + "원");
    }
}
