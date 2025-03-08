import java.util.Scanner;

public class Time {
    private int hour;
    private int minute;
    private int second;

    // Parameterized constructor
    public Time(int h, int m, int s) {
        setTime(h, m, s);
    }

    // Accessors
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    // Mutators
    public void setHour(int h) {
        if (h >= 0 && h < 24) {
            hour = h;
        } else {
            System.out.println("Invalid hour value. Hour value should be between 0 and 23.");
        }
    }

    public void setMinute(int m) {
        if (m >= 0 && m < 60) {
            minute = m;
        } else {
            System.out.println("Invalid minute value. Minute value should be between 0 and 59.");
        }
    }

    public void setSecond(int s) {
        if (s >= 0 && s < 60) {
            second = s;
        } else {
            System.out.println("Invalid second value. Second value should be between 0 and 59.");
        }
    }

    // Method to set the time
    public void setTime(int h, int m, int s) {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

    // Method to print the time in the format hh:mm:ss
    public void print() {
        System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter hour:");
        int hour = scanner.nextInt();
        System.out.println("Enter minute:");
        int minute = scanner.nextInt();
        System.out.println("Enter second:");
        int second = scanner.nextInt();

        Time time = new Time(hour, minute, second);
        time.print();

        scanner.close();
    }
}
