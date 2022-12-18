package pr11new;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CompareTime {
    Calendar calendar;

    public CompareTime() {
        calendar = new GregorianCalendar();
    }

    public void enterData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year");
        calendar.set(Calendar.YEAR, scanner.nextInt());
        System.out.println("Enter month");
        calendar.set(Calendar.MONTH, scanner.nextInt());
        System.out.println("Enter day of month");
        calendar.set(Calendar.DAY_OF_MONTH, scanner.nextInt());
        System.out.println("Enter hour of day");
        calendar.set(Calendar.HOUR_OF_DAY, scanner.nextInt());
        System.out.println("Enter minute of hour");
        calendar.set(Calendar.MINUTE, scanner.nextInt());
        System.out.println("Enter second of minute");
        calendar.set(Calendar.SECOND, scanner.nextInt());
    }

    public void compareWithCurrent(){
        Date date = new GregorianCalendar().getTime();
        if (calendar.getTime().before(date)) System.out.println("Entered date before current");
        else if (calendar.getTime().after(date)) System.out.println("Entered date after current");
        else System.out.println("This is same times, bro");
    }

}
