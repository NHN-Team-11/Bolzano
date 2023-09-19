package Bolzano.Chapter5.jungmin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Triangle {

    private int longestSide;
    private int intermediateSide;
    private int shortestSide;

    public Triangle(int longestSide, int intermediateSide, int shortestSide) {
        int total = longestSide + intermediateSide + shortestSide;
        this.longestSide = Math.max(Math.max(longestSide, intermediateSide), shortestSide);
        this.shortestSide = Math.min(Math.min(longestSide, intermediateSide), shortestSide);
        this.intermediateSide = total - (this.longestSide + this.shortestSide);
    }

    public int getLongestSide() {
        return longestSide;
    }


    public int getIntermediateSide() {
        return intermediateSide;
    }


    public int getShortestSide() {
        return shortestSide;
    }

    public boolean trianglePredicate() {
        if(longestSide >= intermediateSide + shortestSide) {
            throw new IllegalArgumentException("가장 긴변의 길이가 나머지 두 변의 길이 합보다 크면 안됩니다.");
        }
        return true;
    }

    public int premeter() {
        return this.longestSide + this.intermediateSide + this.shortestSide;
    }

    public int semiperimeter() {
        int s = premeter() / 2;
        return (int)Math.sqrt(s * (s - this.longestSide) * (s - this.intermediateSide) * (s - this.shortestSide));
    }

    @Override
    public String toString() {
        return "Triangle [longestSide=" + longestSide + ", intermediateSide=" + intermediateSide + ", shortestSide="
                + shortestSide + "]";
    }
    
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int longestSide = Integer.parseInt(st.nextToken());
        int intermediateSide = Integer.parseInt(st.nextToken());
        int shortestSide = Integer.parseInt(st.nextToken());

        Triangle triangle = new Triangle(longestSide, intermediateSide, shortestSide);
        triangle.trianglePredicate();
        System.out.println(triangle);
        System.out.println(triangle.premeter());
        System.out.println(triangle.semiperimeter());
        System.out.println(practice2.triangleType(sb, longestSide, intermediateSide, shortestSide));
        
    }


    
}
