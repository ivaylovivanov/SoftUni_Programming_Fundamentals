/**
 * You are given a working code that finds the volume of a pyramid. However, 
 * you should consider that the variables exceed their optimum span and have 
 * improper naming. Also, search for variables that have multiple purpose.
 */
package programming_fundamentals.Lab_Data_Types_and_Variables;

import java.util.Scanner;

/**
 *
 * @author There Be Dragons
 */
public class P09_Refactor_Volume_of_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Length: ");
        double length = sc.nextDouble();   
        
        System.out.print("Width: ");
        double width = sc.nextDouble();

        System.out.print("Height: ");
        double height = sc.nextDouble();

        
        double volume = (length * width * height) / 3;
        System.out.print(String.format("Pyramid Volume: %.2f", volume));
    }
}
