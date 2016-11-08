/**
 * Write a program that can calculate the length of the face diagonals, space 
 * diagonals, volume and surface area of a cube (http://www.mathopenref.com/cube.html) 
 * by a given side. On the first line you will get the side of the cube. On the 
 * second line is given the parameter (face, space, volume or area).
 * Output should be rounded to the second digit after the decimal point:
 */
package Exercises_Methods_and_Debugging;

import java.util.Scanner;

/**
 *
 * @author There Be Dragons
 */
public class P08_Cube_Properties {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side = sc.nextDouble();
        String needed = sc.next().toLowerCase();
        double face = 0;
        double space = 0;
        double volume = 0;
        double area = 0;
        switch (needed) {
            case "face":
                face = Math.sqrt(2 * Math.pow(side, 2));
                System.out.printf("%.2f", face);
                break;
            case "space":
                space = Math.sqrt(3 * Math.pow(side, 2));
                System.out.printf("%.2f", space);
                break;
            case "volume":
                volume = Math.pow(side, 3);
                System.out.printf("%.2f", volume);
                break;
            case "area":
                area = 6 * Math.pow(side, 2);
                System.out.printf("%.2f", area);
                break;
            default:
                break;
        }
    }
}
