package Chapter5.채현명;

public class DateFunction {

    public static boolean equalDate(Date date1, Date date2) {
        return (date1.getDay() == date2.getDay()) &&
                (date1.getMonth() == date2.getMonth()) &&
                (date1.getYear() == date2.getYear());
    }

    public static boolean isFowardThenOtherDay(Date date1, Date date2) { // 연도가 앞섰는지, 월이 앞섰는지, 일수가 앞서는지를 확인

        if (date1.getYear() < date2.getYear()) {
            return true;
        } else if (date1.getYear() > date2.getYear()) {
            return false;
        } else {

            if (date1.getMonth() < date2.getMonth()) {
                return true;
            } else if (date1.getMonth() > date2.getMonth()) {
                return false;
            } else {
                if (date1.getDay() < date2.getDay()) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }

    public static boolean isLeapYear(Date d) {

        if ((d.getYear() % 4 == 0 && !(d.getYear() % 100 == 0)) || (d.getYear() % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

}
