/**
 * A marketing company wants to keep record of its employees. Each record would 
 * have the following characteristics:
 * First name
 * Last name
 * Age (0...100)
 * Gender (m or f)
 * Personal ID number (e.g. 8306112507)
 * Unique employee number (27560000…27569999)
 * Declare the variables needed to keep the information for a single employee 
 * using appropriate primitive data types. Use descriptive names. Print the data 
 * at the console.
 */
package Exercises_Data_Types_and_Variables;

import java.math.BigInteger;

/**
 *
 * @author There Be Dragons
 */
public class P09_Employee_Data {
    public static void main(String[] args) {
        String first_name = "Amanda";
        String last_name = "Jonson";
        byte age = 27;
        char gender = 'f';
        long personal_id = 8306112507L;
        int unique_id = 27563571;
        
        System.out.println(String.format("First name: %s", first_name));
        System.out.println(String.format("Last name: %s", last_name));
        System.out.println(String.format("Age: %s", age));
        System.out.println(String.format("Gender: %s", gender));
        System.out.println(String.format("Personal ID: %s", personal_id));
        System.out.println(String.format("Unique Employee number: %s", unique_id));
    }
}
