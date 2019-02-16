package DemoPack.Lesson13.Exceptions.TryAndCatch.Calendar;

import java.util.*;
import java.text.SimpleDateFormat;

public class NYTimeZone {
    public static void main(String[] args) {

        Calendar calNewYork = Calendar.getInstance();
        calNewYork.setTimeZone(TimeZone.getTimeZone("America/New_York"));

        Date dateNY = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy ");
        System.out.println("Today is " + sdf.format(dateNY));

        System.out.println("Time in New York: " + calNewYork.get(Calendar.HOUR_OF_DAY) + ":" + calNewYork.get(Calendar.MINUTE) + ":" + calNewYork.get(Calendar.SECOND));

    }
}
