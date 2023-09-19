public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(2023, 12, 31);
        Date samedate = new Date(2023, 12, 31);
        Date date2 = new Date(2000, 11, 26);
        Date date3 = new Date(2000, 7, 31);

        System.out.println("date 출력 기능");
        System.out.println(date);
        System.out.println("equals 기능");
        System.out.println(date.equals(samedate));
        System.out.println("precedes 판별 기능");
        System.out.println(date.precedes(date2));
        System.out.println(date3.precedes(date2));
        System.out.println("윤년 판별 기능");
        System.out.println(date.isLeapYear());
        System.out.println(date3.isLeapYear());
        System.out.println("다음 날 출력 기능");
        System.out.println(date.nextDay());
        System.out.println(date2.nextDay());
        System.out.println(date3.nextDay());

    }
}
