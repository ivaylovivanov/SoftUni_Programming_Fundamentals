/**
 * You are given the coordinates of two points on a Cartesian coordinate system 
 * - X1, Y1, X2 and Y2. Create a method that prints the point that is closest to
 * the center of the coordinate system (0, 0) in the format (X, Y). If the 
 * points are on a same distance from the center, print only the first one.
 */
package Exercises_Methods_and_Debugging;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author There Be Dragons
 */
public class P06_Center_Point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        
        CheckPoint(x1, y1, x2, y2);
    }
    
    static void CheckPoint(double x1, double y1, double x2, double y2){
        double point1 = Math.abs(Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2)));
        double point2 = Math.abs(Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2)));
        
        if (point2 > point1) {
            System.out.println("(" + ProperFormat(x1) + ", " + ProperFormat(y1) + ")");
        } else {
            System.out.println("(" + ProperFormat(x2) + ", " + ProperFormat(y2) + ")");
        }
    }
    
    static String ProperFormat(double num){
        String n = "";

        if (num - (double)(int)num != 0.0) {
            n = String.valueOf(num);
        } else {
            n = String.valueOf((int)num);
        }      
        
        return n;
    }
}
