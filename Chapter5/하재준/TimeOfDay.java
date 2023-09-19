public class TimeOfDay {
    private int totsec;

    public TimeOfDay(int h, int m, int s) {
        this.totsec = h * 3600 + m * 60 + s;
    }

    public void add(TimeOfDay t) {
        this.totsec += t.totsec;
        if (this.totsec > 3600 * 24) {
            this.totsec -= 3600 * 24;
        }

    }

    public void subtract(TimeOfDay t) {
        this.totsec -= t.totsec;
        if (this.totsec < 0) {
            this.totsec += 3600 * 24;
        }
    }

    public boolean precedes(TimeOfDay t) {
        return this.totsec < t.totsec;
    }

    public boolean equalTo(TimeOfDay t) {
        return this.totsec == t.totsec;
    }

    public String toString() {
        int h = totsec / 3600;
        int m = (totsec - h * 3600) / 60;
        int s = totsec - 3600 * h - 60 * m;
        String hh = (h < 10) ? " " + h : Integer.toString(h);
        String mm = (m < 10) ? " " + m : Integer.toString(m);
        String ss = (s < 10) ? " " + s : Integer.toString(s);

        return hh + ":" + mm + ":" + ss;
    }
}

// TimeOfDay 1=11:15:15 TimeOfDay 2=15:0:0 TimeOfDay 1

// equal to TimeOfDay 2?
// false
