public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time add(Time t) {
        int newSeconds = this.seconds + t.seconds;
        int carry = newSeconds / 60;
        newSeconds %= 60;

        int newMinutes = this.minutes + t.minutes + carry;
        carry = newMinutes / 60;
        newMinutes %= 60;

        int newHours = this.hours + t.hours + carry;
         newHours %= 24;

        return new Time(newHours, newMinutes, newSeconds);
    }

    public Time subtract(Time t) {
        int newSeconds = this.seconds - t.seconds;
        int carry = 0;

        if (newSeconds < 0) {
            newSeconds += 60;
            carry = 1;
        }

        int newMinutes = this.minutes - t.minutes - carry;
        carry = 0;

        if (newMinutes < 0) {
            newMinutes += 60;
            carry = 1;
        }

        int newHours = this.hours - t.hours - carry;

        if (newHours < 0) {
            newHours += 24;
        }

        return new Time(newHours, newMinutes, newSeconds);
    }

    public void displayTime() {
        // String h = String.format("%02d", hours);
        // String m = String.format("%02d", minutes);
        // String s = String.format("%02d", seconds);

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }

    public static void main(String[] args) {
        Time t1 = new Time(10, 45, 30);
        Time t2 = new Time(5, 20, 15);

        Time t3 = t1.add(t2);
        Time t4 = t1.subtract(t2);

        System.out.print("Time 1: ");
        t1.displayTime();

        System.out.print("Time 2: ");
        t2.displayTime();

        System.out.print("Time 1 + Time 2: ");
        t3.displayTime();

        System.out.print("Time 1 - Time 2: ");
        t4.displayTime();
    }
}
