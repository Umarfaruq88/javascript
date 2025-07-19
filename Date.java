package lab08;

public class Date {
    private int day;
    private int month;
    private int year;
    private final String[] monthNames = {"January", "February", "March", "April", "May", "June",
                                         "July", "August", "September", "October", "November", "December"};
    private final int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // Default constructor
    public Date() {
        this(1, 1, 2012);
    }

    // Constructor 1: dd, mm, yyyy
    public Date(int dd, int mm, int yyyy) {
        setYear(yyyy);
        setMonth(mm);
        setDay(dd);
    }

    // Constructor 2: month name, dd, yyyy
    public Date(String monthName, int dd, int yyyy) {
        setYear(yyyy);
        this.month = convertFromMonthName(monthName);
        setDay(dd);
    }

    // Constructor 3: ddd, yyyy
    public Date(int ddd, int yyyy) {
        setYear(yyyy);
        convertFromDayOfYear(ddd);
    }

    public void setDay(int dd) {
        if (dd > 0 && dd <= daysInMonth()) {
            this.day = dd;
        } else {
            throw new IllegalArgumentException("Invalid day: " + dd);
        }
    }

    public void setMonth(int mm) {
        if (mm >= 1 && mm <= 12) {
            this.month = mm;
        } else {
            throw new IllegalArgumentException("Invalid month: " + mm);
        }
    }

    public void setYear(int yyyy) {
        if (yyyy >= 1900 && yyyy <= 2100) {
            this.year = yyyy;
        } else {
            throw new IllegalArgumentException("Invalid year: " + yyyy);
        }
    }

    public String toString() {
        return String.format("%02d/%02d/%d", day, month, year);
    }

    public String toMonthNameDateString() {
        return String.format("%s %d, %d", monthNames[month - 1], day, year);
    }

    public String toDayDateString() {
        return String.format("%d %d", convertToDayOfYear(), year);
    }

    private int convertFromMonthName(String monthName) {
        for (int i = 0; i < monthNames.length; i++) {
            if (monthNames[i].equalsIgnoreCase(monthName)) {
                return i + 1;
            }
        }
        return 1; // default to January
    }

    private int daysInMonth() {
        if (month == 2 && leapYear()) {
            return 29;
        }
        return monthDays[month - 1];
    }

    private boolean leapYear() {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }

    private void convertFromDayOfYear(int ddd) {
        if (ddd < 1 || ddd > (leapYear() ? 366 : 365)) {
            ddd = 1;
        }

        int remainingDays = ddd;
        for (int i = 0; i < 12; i++) {
            int days = monthDays[i];
            if (i == 1 && leapYear()) days = 29;

            if (remainingDays <= days) {
                this.month = i + 1;
                this.day = remainingDays;
                return;
            } else {
                remainingDays -= days;
            }
        }
    }

    private int convertToDayOfYear() {
        int ddd = 0;
        for (int i = 0; i < month - 1; i++) {
            ddd += (i == 1 && leapYear()) ? 29 : monthDays[i];
        }
        return ddd + day;
    }
}
