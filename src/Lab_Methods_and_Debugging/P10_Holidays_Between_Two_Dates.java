/**
 * You are assigned to find and fix the bugs in an existing piece of code, using
 * the Visual Studio debugger. You should trace the program execution to find the 
 * lines of code that produce incorrect or unexpected results. You are given a 
 * program (existing source code) that aims to count the non-working days between 
 * two dates given in format day.month.year (e.g. between 1.05.2015 and 15.05.2015 
 * there are 5 non-working days – Saturday and Sunday).
 */
package Lab_Methods_and_Debugging;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author There Be Dragons
 */
public class P10_Holidays_Between_Two_Dates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        String startDateString = sc.next();
        String endDateString = sc.next();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.M.yyyy");
        formatter = formatter.withLocale( Locale.US );  
        LocalDate startDate = LocalDate.parse(startDateString, formatter);
        LocalDate endDate = LocalDate.parse(endDateString, formatter);
        
        int holidaysCount = 0;
        for (LocalDate date = startDate; date.isBefore(endDate) || date.isEqual(endDate); date = date.plusDays(1)){
            if (date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                holidaysCount++;
            }                
        }
        System.out.println(holidaysCount);
    }
}
