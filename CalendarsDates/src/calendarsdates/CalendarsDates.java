package calendarsdates;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.text.DateFormat;

/**
 * 27/03/14
 *
 * @author jonathan
 *
 * Java2.pdf pag95
 */
public class CalendarsDates {

    public static void main(String[] args) {
        // constantes
        System.out.println("Day week: " + Calendar.DAY_OF_WEEK);
        System.out.println("Month: " + Calendar.MONTH);

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println("Greg: " + gc.getTime());

        // sumar datos
        gc.add(Calendar.YEAR, 10);
        gc.add(Calendar.DATE, 50);
        gc.add(Calendar.HOUR, 3);
        System.out.println("suma: " + gc.getTime());

        Date date1 = new Date();
        Date date2 = new Date(2014, 6, 20);
        System.out.println("Date: " + date1);
        System.out.println(" - " + date1.after(date2));

        // formato corto (no necesita parámetros)
        DateFormat df = DateFormat.getDateTimeInstance(
                DateFormat.SHORT, DateFormat.SHORT);
        System.out.println("DateFormat.SHORT:\n" + df.format(date1));

        // formato largo
        DateFormat df2 = DateFormat.getDateTimeInstance(
                DateFormat.LONG, DateFormat.LONG);
        System.out.println("DateFormat.LONG:\n" + df2.format(date1));
    }

}
