/**
 * Calculate how many courses will be needed to elevate n persons by using an 
 * elevator of capacity of p persons. The input holds two lines: the number of 
 * people n and the capacity p of the elevator.
 */
package programming_fundamentals.Lab_Data_Types_and_Variables;

import java.util.Scanner;

/**
 *
 * @author There Be Dragons
 */
public class P05_Elevator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double people = sc.nextDouble();
        
        Scanner sc1 = new Scanner(System.in);
        double capacity = sc.nextDouble();
        
        int courses = (int)Math.ceil(people / capacity);
        
        System.out.println(people % capacity);
        System.out.println(courses);
    }
}
