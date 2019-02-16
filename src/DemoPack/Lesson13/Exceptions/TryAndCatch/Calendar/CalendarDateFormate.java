package DemoPack.Lesson13.Exceptions.TryAndCatch.Calendar;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class CalendarDateFormate {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.setTime(new Date()); //today is 12-12-2012
        System.out.println(c.get(Calendar.YEAR));       //print year: 2012
        System.out.println(c.get(Calendar.MONTH) + 1);    //print month, counts from 0
        System.out.println(c.get(Calendar.DAY_OF_MONTH));//print day


        LocalDate localDate = LocalDate.now();
        LocalDate tomorrow = LocalDate.now().plusDays(1);   //add to today hrs/weeks/etc.
        LocalDate previousMonthSameday = LocalDate.now().minus(1, ChronoUnit.MONTHS);

        System.out.println(localDate + "\n" + tomorrow + "\n" + previousMonthSameday);

        int today = LocalDate.now().getDayOfMonth(); // get day of month
        System.out.println(today);

        java.util.Date date = new java.util.Date();
        System.out.println(date);

        Date localTime = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy h a: s:S z");
        System.out.println("Now is " + sdf.format(localTime));

        LocalDate nextWeek = LocalDate.now().plusWeeks(1);   //add to today hrs/weeks/etc.
        System.out.println("Next week it will be " + nextWeek);
    }
}