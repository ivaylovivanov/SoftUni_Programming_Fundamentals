/**
 * Create a new Java project and create a program that assigns floating point 
 * values to variables. Be sure that each value is stored in the correct 
 * variable type (try to find the most suitable variable type in order to save 
 * memory). Finally, you need to print all variables to the console.
 * 3.141592653589793238
 * 1.60217657
 * 7.8184261974584555216535342341
 */
package Exercises_Data_Types_and_Variables;

import java.math.BigDecimal;
/**
 *
 * @author There Be Dragons
 */
public class P03_Practice_Floating_Point_Numbers {
    public static void main(String[] args) {
        BigDecimal PI = new BigDecimal("3.141592653589793238");
        double someDouble = 1.60217657;
        BigDecimal someBigDecimal = new BigDecimal("7.8184261974584555216535342341");
        
        System.out.println(PI);
        System.out.println(someDouble);
        System.out.println(someBigDecimal);
    }
}
