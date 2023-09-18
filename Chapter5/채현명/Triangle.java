package Chapter5.채현명;

import java.util.Arrays;

public class Triangle {
    private double lengthFirst;
    private double lengthSecond;
    private double lengthThird;

    public Triangle(double lengthFirst, double lengthSecond, double lengthThird) {
        this.lengthFirst = lengthFirst;
        this.lengthSecond = lengthSecond;
        this.lengthThird = lengthThird;
    }

    public void returnLength() {
        double[] array = { this.lengthFirst, this.lengthSecond, this.lengthThird };
        Arrays.sort(array);
        boolean isSameValue = array[0] == array[1] || array[0] == array[2] || array[1] == array[2];

        if (isSameValue) {
            System.out.println("First : " + array[2]);
            System.out.println("Same Value : " + array[1]);
            System.out.println("Same Value : " + array[0]);
        } else {
            System.out.println("First: " + array[2]);
            System.out.println("Second : " + array[1]);
            System.out.println("Third : " + array[0]);
        }
    }

    public boolean isCanTriangle() {
        double[] array = { this.lengthFirst, this.lengthSecond, this.lengthThird };
        Arrays.sort(array);
        double sumExceptBest = array[0] + array[1];
        boolean canTri = sumExceptBest > array[2];

        if (canTri) {
            System.out.println("두 변의 합이 가장 큰 변의 길이보다 작습니다. 삼각형의 변이 가능합니다.");
            return true;
        } else {
            System.out.println("주어진 세 변으로는 유효한 삼각형을 만들 수 없습니다.");
            return false;
        }
    }

    public double halfCircumference() {
        return (this.lengthFirst + this.lengthSecond + this.lengthThird) / 2.0;
    }

    public double circumference() {
        return this.lengthFirst + this.lengthSecond + this.lengthThird;
    }

    public double Area() {
        double s = halfCircumference();
        return Math.sqrt(s * (s - this.lengthFirst) * (s - this.lengthSecond) * (s - this.lengthThird));
    }

    public void typeTriangle() {
        boolean symetric = this.lengthFirst == this.lengthSecond || this.lengthFirst == this.lengthThird
                || this.lengthSecond == this.lengthThird;

        boolean regular = this.lengthFirst == this.lengthSecond && this.lengthFirst == this.lengthThird;

        if (regular) {
            System.out.println("Regular");
        } else if (symetric) {
            System.out.println("Symetric");
        } else {
            System.out.println("Irregular");
        }
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 3, 5);
        triangle.returnLength();

        System.out.print("삼각형 변이 가능한지 여부 : ");
        triangle.isCanTriangle();
        System.out.println();

        System.out.println("삼각형 둘레 : " + triangle.circumference());
        System.out.println("삼각형 면적 : " + triangle.Area());
        System.out.println();

        System.out.print("삼각형의 유형 : ");
        triangle.typeTriangle();

    }

}
