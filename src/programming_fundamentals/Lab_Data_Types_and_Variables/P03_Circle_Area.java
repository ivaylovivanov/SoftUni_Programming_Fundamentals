/**
 * Write program to enter a radius r (real number) and print the area of the 
 * circle with exactly 12 digits after the decimal point. Use data type of 
 * enough precision to hold the results.
 */
package programming_fundamentals.Lab_Data_Types_and_Variables;

import java.util.Scanner;

/**
 *
 * @author There Be Dragons
 */
public class P03_Circle_Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        
        double area = Math.PI * radius * radius;
        String output = String.format("%.12f", area);
        System.out.printf(output);
    }
}
