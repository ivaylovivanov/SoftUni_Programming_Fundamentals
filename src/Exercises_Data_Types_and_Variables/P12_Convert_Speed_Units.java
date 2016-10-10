/**
 * Create a program to ask the user for a distance (in meters) and the time taken
 * (as three numbers: hours, minutes, seconds), and print the speed, in meters 
 * per second, kilometers per hour and miles per hour.
 * Assume 1 mile = 1609 meters.
 * Input
 * On first line you receive – distance in meters
 * On second – hours
 * On third – minutes
 * On fourth – seconds
 * Output
 * Every number in the output should be precise up to 6 digits after the floating point
 * On first line – speed in meters per second (m/s)
 * On second line – speed in kilometers per hour (km/h)
 * On third line – speed in miles per hour (mph)
 */
package Exercises_Data_Types_and_Variables;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author There Be Dragons
 */
public class P12_Convert_Speed_Units {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long meters = sc.nextLong();
        int hours = sc.nextInt();
        int minutes = sc.nextInt();
        int seconds = sc.nextInt();
        
        long timeSeconds = (long)seconds + (long)(minutes * 60) + (long)(hours * 3600);
        double onlyHours = (double)timeSeconds / 3600;
        double km = (double)meters / 1000;
        double miles = (double)meters / 1609;         
        
        double metersPerSecond = (double)meters / (double)timeSeconds;
        double kmPerHour = km / onlyHours;
        double milesPerHour = miles / onlyHours;
        
        DecimalFormat myFormatter6 = new DecimalFormat("0.######");
        DecimalFormat myFormatter5 = new DecimalFormat("0.#####");
       
        if (metersPerSecond / 10.0 >= 1.0) {
            System.out.println(myFormatter5.format(metersPerSecond));
        } else {
            System.out.println(myFormatter6.format(metersPerSecond));
        }
       
        if (kmPerHour / 10.0 >= 1.0) {
            System.out.println(myFormatter5.format(kmPerHour));
        } else {
            System.out.println(myFormatter6.format(kmPerHour));
        }
       
        if (milesPerHour / 10.0 >= 1.0) {
            System.out.println(myFormatter5.format(milesPerHour));
        } else {
            System.out.println(myFormatter6.format(milesPerHour));
        }
    }
}
