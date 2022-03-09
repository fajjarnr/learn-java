package programmer.clasess;

import java.util.Calendar;
import java.util.Date;

public class DateCalendarApp {
    public static void main(String[] args) {
        Date date = new Date();
        long milisecond = date.getTime();

        System.out.println(date);
        System.out.println(milisecond);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2022);
        calendar.set(Calendar.MONTH, Calendar.MARCH);
        calendar.set(Calendar.DAY_OF_MONTH, 9);
        calendar.set(Calendar.HOUR_OF_DAY,18);
        calendar.set(Calendar.MINUTE, 35);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        Date result = calendar.getTime();
        System.out.println(result);
    }
}
