package Chapter5.Minseok;

public class Testday {
    public static void main(String[] args) {
        Date date1 = new Date(15, 3, 2022);
        Date date2 = new Date(20, 3, 2022);

        System.out.println("날짜가 동일한가 ? : " + Datefunction.equalDate(date1, date2));
        System.out.println("date1 이 date2보다 앞선 날짜인가? " + Datefunction.isFowardThenOtherDay(date1, date2));

        if (Datefunction.isLeapYear(date1)) {
            System.out.println(date1.getYear() + "년은 윤년입니다.");
        } else {
            System.out.println(date1.getYear() + "년은 윤년이 아닙니다.");
        }

    }

}
