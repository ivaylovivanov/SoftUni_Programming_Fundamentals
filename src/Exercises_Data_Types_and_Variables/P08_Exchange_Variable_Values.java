/**
 * Declare two integer variables a and b and assign them with 5 and 10 and after 
 * that exchange their values by using some programming logic. Print the 
 * variable values before and after the exchange, as shown below:
 */
package Exercises_Data_Types_and_Variables;

/**
 *
 * @author There Be Dragons
 */
public class P08_Exchange_Variable_Values {
    public static void main(String[] args) {
        byte a = 5;
        byte b = 10;
        System.out.println("Before:");
        System.out.println(String.format("a = %s", a));
        System.out.println(String.format("b = %s", b));
        
        byte temp = a;
        a = b;
        b = temp;
        System.out.println("After:");
        System.out.println(String.format("a = %s", a));
        System.out.println(String.format("b = %s", b));
    }
}
