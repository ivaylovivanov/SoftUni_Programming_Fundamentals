/**
 * Write a program that enters first name, last name and age and prints "Hello,
 * <first name> <last name>. You are <age> years old.". 
 * Use interpolated strings.
 */
package programming_fundamentals.Lab_Data_Types_and_Variables;

import java.util.Scanner;

/**
 *
 * @author There Be Dragons
 */
public class P08_Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first_name = sc.next();
        
        String last_name = sc.next();
        int age = sc.nextInt();
        
        System.out.println(String.format("Hello, %s %s. You are %s years old.", first_name, last_name, age));
    }
}
