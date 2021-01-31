// @ironsubhajit
// Result class important here;

import java.util.*;
import java.text.*;

class Result {
    public static String findDay(int year, int month, int day) {
        DateFormat df = new SimpleDateFormat("EEEE");
        Calendar cal = Calendar.getInstance();
        month = (month-1); // As in java january == 0;
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DATE, day);
        String date = df.format(cal.getTime());
        return date.toUpperCase();
    }
}

public class DateTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int year = sc.nextInt();
        System.out.print("Enter the month: ");
        int month = sc.nextInt();
        System.out.print("Enter the day: ");
        int day = sc.nextInt();
        
        String res = Result.findDay(year, month, day);
        System.out.println("Day of week is: "+ res);

        sc.close();
    }
}
