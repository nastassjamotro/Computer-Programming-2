/*
    A Day object represents a day in the Julian/Gregorain calendar.
 */
 import java.util.GregorianCalendar;

public class Day 
{
    private int year;
    private int month;
    private int date;
    
    private static final int[] DAYS_PER_MONTH
          = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    
    private static final int GREGORIAN_START_YEAR = 1582;
    private static final int GREGORIAN_START_MONTH = 10;
    private static final int GREGORIAN_START_DAY = 15;
    private static final int JULIAN_END_DAY = 4;
    
    private static final int JANUARY = 1;
    private static final int FEBRUARY = 2;
    private static final int DECEMBER = 12;
    
    /**
        Constructs a day object representing today's date.
     */
    public Day()
    {
        GregorianCalendar today = new GregorianCalendar();
        year = today.get(GregorianCalendar.YEAR);
        month = today.get(GregorianCalendar.MONTH) + 1;
        date = today.get(GregorianCalendar.DAY_OF_MONTH);
    }
    
    /**
        Constructs a day with a give year, month, and day
        of the Julian/Gregorian calendar. The Julian calendar
        is used for all days before October 15, 1582
        @param aYear a year != 0
        @parm aMonth a month between 1 and 12
        @param aDate a date between 1 and 31
     */
    public Day(int aYear, int aMonth, int aDate)
    {
        year = aYear;
        month = aMonth;
        date = aDate;
    }
    
    /**
        Returns the year of this day.
        @return the year
     */
    public int getYear()
    {
        return year;
    }
    
    /**
        Returns the month of this day.
        @return the month
     */
    public int getMonth()
    {
        return month;
    }
    
    /**
        Return the day of the month of this day.
        @return the day of the month
     */
    public int getDate()
    {
        return date;
    }
    
    /**
        Returns a day that is a certain number of days away from
        this day.
        @param n the number of days, can be negative
        @param a day that is n days away from this one
     */
    public Day addDays(int n)
    {
        Day result = this;
        while (n > 0)
        {
            result = result.nextDay();
            n--;
        }
        while (n < 0)
        {
            result = result.NextDay();
            n++;
        }
        
    }
}
 
