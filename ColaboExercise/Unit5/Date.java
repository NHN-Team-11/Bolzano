package ColaboExercise.Unit5;

public class Date {
    private int day;
    private int month;
    private int year; // hii

    public boolean isLeapYear() {
        return this.year % 4 == 0 && this.year % 100 != 0 || this.year % 400 == 0;
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toString() {
        return this.year + "년 " + this.month + "월 " + this.day + "일";
    }

    public boolean precedes(Date date) {
        return (this.year * 365 + this.month * 30 + this.day) > (date.year * 365 + date.month * 30 + date.day);
    }

    public boolean equals(Date date) {
        return (this.year == date.year) && (this.month == date.month) && (this.day == date.day);
    }

    public Date nextDay() {
        int[] yearDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        Date nextDate = new Date(this.year, this.month, this.day);
        if (nextDate.isLeapYear())
            yearDays[1] = 29;
        if (nextDate.day == yearDays[nextDate.month - 1]) {
            if (nextDate.month == 12) {
                nextDate.year += 1;
                nextDate.month = 0;
            }
            nextDate.month += 1;
            nextDate.day = 1;
        } else {
            nextDate.day += 1;
        }

        return nextDate;

}