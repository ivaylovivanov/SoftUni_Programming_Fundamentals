/**
 * Write program to enter an integer number of centuries and convert it to 
 * years, days, hours, minutes, seconds, milliseconds, microseconds, nanoseconds.
 */
package Exercises_Data_Types_and_Variables;

import java.math.*;
import java.util.Scanner;

/**
 *
 * @author There Be Dragons
 */
public class P11_Centuries_to_Nanoseconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger thousand = new BigInteger("1000");
        BigInteger hundred = new BigInteger("100");
        BigInteger twentyFour = new BigInteger("24");
        BigInteger sixty = new BigInteger("60");
        
        byte centuries = sc.nextByte();
        int years = centuries * 100;
        int days = (int)(years * 365.2422);
        int hours = days * 24;
        long minutes = hours * 60;
        BigInteger seconds = BigInteger.valueOf(minutes).multiply(sixty);
        BigInteger miliseconds = seconds.multiply(thousand);
        BigInteger microseconds = miliseconds.multiply(thousand);        
        BigInteger nanoseconds = microseconds.multiply(thousand);
        
        
        System.out.println(String.format("%s centuries = %s years = %s days = %s hours = %s minutes = %s seconds = %s milliseconds = %s microseconds = %s nanoseconds", 
                centuries, years, days, hours, minutes, seconds, miliseconds, microseconds, nanoseconds
        ));
    }
}
