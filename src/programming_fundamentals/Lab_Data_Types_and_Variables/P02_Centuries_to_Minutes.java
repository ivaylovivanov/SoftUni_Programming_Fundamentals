/*
Write program to enter an integer number of centuries and convert it to years, 
days, hours and minutes.
Hints:
1. Use appropriate data type to fit the result after each data conversion.
2. Assume that a year has 365.2422 days at average (the Tropical year).
*/

package programming_fundamentals.Lab_Data_Types_and_Variables;

import java.util.Scanner;

/**
 *
 * @author There Be Dragons
 */
public class P02_Centuries_to_Minutes {
    public static void main(String[] args) {
        System.out.print("Centuries = ");
        Scanner sc = new Scanner(System.in);
        int centuries = sc.nextInt();
        int years = centuries * 100;
        int days = (int)(years * 365.2422);
        int hours = days * 24;
        int minutes = hours * 60;
        String output = String.format("%s centuries = %s years = %s days = %s hours = %s minutes", centuries, years, days, hours, minutes);
        System.out.println(output);
    }
}
