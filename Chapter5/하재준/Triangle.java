import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Triangle {
    private int max;
    private int mid;
    private int min;

    Triangle(int a, int b, int c) {
        this.max = a;
        this.mid = b;
        this.min = c;
    }

    public void findLength() {
        int[] widths = new int[3];
        widths[0] = this.max;
        widths[1] = this.mid;
        widths[2] = this.min;
        Arrays.sort(widths);
        this.max = widths[2];
        this.mid = widths[1];
        this.min = widths[0];
        System.out.println("가장 긴 변: " + this.max);
        System.out.println("중간 변: " + this.mid);
        System.out.println("가장 짧은 변: " + this.min);
    }

    public boolean triangleConditionTest() {
        return this.max < this.mid + this.min;
    }

    public int getPerimeter() {
        return this.max + this.mid + this.min;
    }

    public double getArea() {
        int s = (this.max + this.mid + this.min) / 2;
        return Math.sqrt(s * (s - this.max) * (s - this.mid) * (s - this.min));
    }

    public String triangleCheck() {
        if (this.max == this.mid) {
            if (this.mid == this.min) {
                return "정삼각형";
            } else {
                return "이등변 삼각형";
            }
        } else {
            if (this.max == this.min) {
                return "이등변 삼각형";
            } else if (this.mid == this.min) {
                return "이등변 삼각형";
            } else {
                return "그냥 삼각형";
            }
        }
    }

}
