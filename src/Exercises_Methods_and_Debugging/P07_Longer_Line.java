/**
 * You are given the coordinates of four points in the 2D plane. The first and 
 * the second pair of points form two different lines. Print the longer line in 
 * format "(X1, Y1)(X2, Y2)" starting with the point that is closer to the center 
 * of the coordinate system (0, 0) (You can reuse the method that you wrote for 
 * the previous problem). If the lines are of equal length, print only the first 
 * one.
 */
package Exercises_Methods_and_Debugging;

import java.util.Scanner;

/**
 *
 * @author There Be Dragons
 */
public class P07_Longer_Line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        
        double x4 = sc.nextDouble();
        double y4 = sc.nextDouble();
        
        double d1 = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        double d2 = Math.sqrt(Math.pow((x4 - x3),2) + Math.pow((y4 - y3),2));
        
        if (d2 > d1) {
            CheckPoint(x3, y3, x4, y4);
        } else {
            CheckPoint(x1, y1, x2, y2);
        }
    }
    
    public static String ProperFormat(double num){
        String n = "";

        if (num - (double)(int)num != 0.0) {
            n = String.valueOf(num);
        } else {
            n = String.valueOf((int)num);
        }      
        
        return n;
    }
    
    static void CheckPoint(double x1, double y1, double x2, double y2){
        double point1 = Math.abs(Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2)));
        double point2 = Math.abs(Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2)));
        
        if (point2 >= point1) {
            System.out.println("(" + ProperFormat(x1) + ", " + ProperFormat(y1) + ")(" + ProperFormat(x2) + ", " + ProperFormat(y2) + ")");
        } else {
            System.out.println("(" + ProperFormat(x2) + ", " + ProperFormat(y2) + ")(" + ProperFormat(x1) + ", " + ProperFormat(y1) + ")");
        } 
    }
}
