package Chapter5.Minseok;

import java.util.Arrays;

public class ex5_4 {
    private int a;
    private int b;
    private int c;

    public ex5_4(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean test(int a, int b, int c) {
        if (max(a, b, c) == a) {
            if (b + c > a) {
                return true;
            }
            return false;
        } else if (max(a, b, c) == b) {
            if (a + c > b) {
                return true;
            }
            return false;
        } else {
            if (a + b > c) {
                return true;
            }
            return false;
        }
    }

    public int max(int a, int b, int x) {
        if (a > b && b > c) {
            return a;
        } else if (b > a && a > c) {
            return b;
        } else {
            return c;
        }
    }

    // public int max(int a, int b) {
    // if (a > b) {
    // return a;
    // } else {
    // return b;
    // }
    // }

    // public int min(int a, int b) {
    // if (a > b) {
    // return b;
    // } else {
    // return a;
    // }
    // }

    // public int[] sortlength() {
    // int[] arr = { a, b, c };
    // Arrays.sort(arr);
    // return arr;
    // }

    public void trianglelength() {
        if (this.a > this.b && this.b > this.c) {
            System.out.println("max : " + a + ", middle : " + b + ", min : " + c);
        } else if (this.a > this.b && this.c > this.b) {
            System.out.println("max : " + a + ", middle : " + c + ", min : " + b);
        } else if (this.b > this.a && this.a > this.c) {
            System.out.println("max : " + b + ", middle : " + a + ", min : " + c);
        } else if (this.b > this.a && this.c > this.a) {
            System.out.println("max : " + b + ", middle : " + c + ", min : " + a);
        } else if (this.c > this.a && this.a > this.b) {
            System.out.println("max : " + c + ", middle : " + a + ", min : " + b);
        } else {
            System.out.println("max : " + c + ", middle : " + b + ", min : " + a);
        }
    }

    public int area() {
        double s = (a + b + c) / 2.0;
        return (int) Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public int perimeter() {
        return a + b + c;
    }

    public String tringangletype(String s) {
        if (a + b > c) {
            if (a == b && b == c) {
                s = "정삼각형";
                return s;
            } else if (a == b || b == c || c == a) {
                s = "이등변 삼각형";
                return s;
            } else if (a * a + b * b == c * c) {
                s = "직각 삼각형";
                return s;
            } else {
                s = "삼각형";
                return s;
            }
        } else {
            s = "삼각형이 아님.";
            return s;
        }
    }

}
