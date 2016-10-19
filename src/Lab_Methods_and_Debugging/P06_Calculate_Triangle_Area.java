/**
 * Create a method that calculates and returns the area of a triangle by given 
 * base and height:
 */
package Lab_Methods_and_Debugging;

import java.util.Scanner;

/**
 *
 * @author There Be Dragons
 */
public class P06_Calculate_Triangle_Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double ha = sc.nextDouble();
        double area = GetTriangleArea(a, ha);
        if (area % 2.0 == 0.0) {
            System.out.println((int)area);
        } else {
            System.out.println(area);
        }

    }
    
    static double GetTriangleArea(double a, double ha){
        double area;
        
        area = a * ha/2;
        
        return area;
    }
}
