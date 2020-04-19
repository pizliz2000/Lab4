package com.example.fourlab;




import java.util.Calendar;
import java.util.GregorianCalendar;


public class DataChooser {
    long diffInMillisec = 0;
    Calendar calendar = new GregorianCalendar();
    Calendar calendarCurrent = new GregorianCalendar();

    public int dataLeft(int year, int month, int dayOfMonth) {


        calendar.set(dayOfMonth, (month + 1), year);
// Get the difference between two dates in milliseconds
        diffInMillisec = calendarCurrent.getTimeInMillis() - calendar.getTimeInMillis();
// Get difference between two dates in days
        int days = (int) (diffInMillisec / (24 * 60 * 60 * 1000));
        int daysLong=days+61;
        return daysLong;
    }
}
