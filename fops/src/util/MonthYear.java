/**
 * A simple utility class for holding a month and a year.
 */

package util;

import java.util.Calendar;

public class MonthYear {
    
    private int month;
    private int year;

    public MonthYear(int month, int year) {
        if (month < 1 || month > 12) {
            //TODO: specify exception to be thrown
        }
        this.month = month;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public MonthYear timeSince() {
        Calendar calendar = Calendar.getInstance();
        int m = calendar.get(Calendar.MONTH);
        int y = calendar.get(Calendar.YEAR);
        return difference(m, y);
    }

    public MonthYear difference(int month, int year) {
        return difference(new MonthYear(month, year));
    }

    public MonthYear difference(MonthYear my) {
        int dyear, dmonth;
        if (my.getMonth() == month) {
            dyear = 0;
        } else if (my.getMonth() > month) {
            dyear = my.getYear() - year;
        } else {
            dyear = my.getYear() - year - 1;
        }
        dmonth = (my.getMonth() - month);
        return new MonthYear(dmonth, dyear);
    }
}
