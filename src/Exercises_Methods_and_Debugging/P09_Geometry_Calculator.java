/**
 * Write a program that can calculate the area of four different geometry figures - 
 * triangle, square, rectangle and circle.
 * On the first line you will get the figure type. Next you will get parameters 
 * for the chosen figure, each on a different line:
 * Triangle - side and height
 * Square - side
 * Rectangle - width and height
 * Circle - radius
 * The output should be rounded to the second digit after the decimal point:
 */
package Exercises_Methods_and_Debugging;

import java.util.Scanner;

/**
 *
 * @author Ivailo
 */
public class P09_Geometry_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String figure = sc.next().toLowerCase();
        double a = sc.nextDouble();
        double ha = 0;
        if (figure.equals("triangle") || figure.equals("rectangle")) {
            ha = sc.nextDouble();
        }

        switch(figure){
            case "triangle":
                calcTriangleArea(a, ha);
                break;
            case "square":
                calcSquareArea(a);
                break;
            case "rectangle":
                calcRectangleArea(a, ha);                        
                break;
            case "circle":
                calcCircleArea(a);
                break;
            default:
                break;
        }
    }
    
    static void calcTriangleArea(double a, double ha){
        double area = (a * ha) / 2;
        System.out.printf("%.2f", area);
    }
    
    static void calcSquareArea(double a){
        double area = Math.pow(a, 2);
        System.out.printf("%.2f", area);
    }
    
    static void calcCircleArea(double r){
        double area = Math.PI * Math.pow(r, 2);
        System.out.printf("%.2f", area);
    }
    
    static void calcRectangleArea(double a, double b){
        double area = a * b;
        System.out.printf("%.2f", area);
    }
}
