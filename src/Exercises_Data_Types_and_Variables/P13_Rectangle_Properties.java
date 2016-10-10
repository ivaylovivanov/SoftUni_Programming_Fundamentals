/**
 * Create a program to calculate rectangle’s perimeter, area and diagonal by 
 * given its width and height.
 */
package Exercises_Data_Types_and_Variables;

import java.util.Scanner;

/**
 *
 * @author There Be Dragons
 */
public class P13_Rectangle_Properties {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        
        double perimeter = width*2.0 + height*2.0;
        double area = width * height;
        double diagonal = Math.sqrt(Math.pow(width, 2.0) + Math.pow(height, 2.0));
        if (perimeter % 10.0 == 0.0) {
            System.out.println(String.format("%s", (int)perimeter));
        } else {
            System.out.println(String.format("%s", perimeter));
        }
        
        if (area % 10.0 == 0.0) {
            System.out.println(String.format("%s", (int)area));
        } else {
            System.out.println(String.format("%s", area));
        }
        
        System.out.println(String.format("%.13f", diagonal));
    }
}
