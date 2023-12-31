package Chapter5.Minseok;

public class Date {
    private int year;
    private int day;
    private int month;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static boolean equalDate(Date date1, Date date2) {
        return (date1.getDay() == date2.getDay()) && (date1.getMonth() == date2.getMonth())
                && (date1.getYear() == date2.getYear());
    }

    public static boolean isFowardThenOtherDay(Date date1, Date date2) {
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
                }
                return false;
            }
        }
    }

    public static boolean isLeapYear(Date day) {
        if ((day.getYear() % 4 == 0 && !(day.getYear() % 100 == 0)) || (day.getYear() % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public int getYear() {
        return year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

}
