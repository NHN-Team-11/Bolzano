package ColaboExercise.Unit5;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {

        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public boolean equalTo(Date d) {
        return this.day == d.day &&
        this.month == d.month && 
        this.year == d.year;
    }

    public boolean procedes(Date d) {
        if(this.year < d.year) {
            return true;
        }
        else if(this.year == d.year) {
            if(this.month < d.month) {
                return true;
            }
            else if(this.month == d.month) {
                if(this.day < d.day) {
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        else return false;
    }

    public boolean leapYear() {
        if((this.year % 4 == 0 && this.year % 100 != 0) || this.year % 400 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public void nextDate() {
        
        switch(this.month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: {
                this.day += 1;
                if(this.day > 31) {
                    this.month += 1;
                    this.day = 1;
                }
                break;
            }
            case 2 : {
                this.day += 1;
                if(this.day > 28) {
                    this.month += 1;
                    this.day = 1;
                }
                break;
            }
            case 4: case 6: case 9: case 11: {
                this.day += 1;
                if(this.day > 30) {
                    this.month += 1;
                    this.day = 1;
                }
                break;
            }
        }

        if(this.month > 12) {
            this.month -= 12;
            this.year += 1;
        }
        
    }

    @Override
    public String toString() {
        return "Date [" + year + "년 " + month + "월 " + day + "일" + "]";
    }
    
    public static void main(String[] args) {
        Date date = new Date(31, 12, 2020);
        Date date2 = new Date(31, 12, 2020);
        System.out.println(date);
        System.out.println(date.equalTo(date2));
        date2.nextDate();
        System.out.println(date2);
        System.out.println(date.procedes(date2));
        System.out.println(date.leapYear());
    }

    
}
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
