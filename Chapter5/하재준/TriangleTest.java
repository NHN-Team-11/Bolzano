public class TriangleTest {
    public static void main(String[] args) {
        Triangle t = new Triangle(7, 4, 3);
        System.out.println("문자열 길이 테스트");
        System.out.println("-------------------");
        t.findLength();
        System.out.println("-------------------");
        System.out.println("삼각형 조건 테스트 : " + t.triangleConditionTest());
        System.out.println("삼각형의 둘레 : " + t.getPerimeter());
        System.out.println("삼각형의 면적 : " + t.getArea());
        System.out.println("삼각형 유형 테스트 : " + t.triangleCheck());

    }
}