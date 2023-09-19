public class TestTimeOfDay {
    public static void main(String[] args) {
        TimeOfDay t1 = new TimeOfDay(10, 45, 15);
        TimeOfDay t2 = new TimeOfDay(15, 00, 00);
        if (t1.precedes(t2)) {
            t1.add(new TimeOfDay(0, 30, 00));
        } else
            t2.subtract(new TimeOfDay(0, 30, 00));
        System.out.println("TimeOfDay 1 = " + t1);
        System.out.println("TimeOfDay 2 = " + t2);
        System.out.println("TimeOfDay 1 equal to TimeOfDay 2 ? "
                + t1.equalTo(t2));
    }
}