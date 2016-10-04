/**
 * Declare two string variables and assign them with “Hello” and “World”. 
 * Declare an object variable and assign it with the concatenation of the first
 * two variables (mind adding an interval between). Declare a third string 
 * variable and initialize it with the value of the object variable (you should 
 * perform type casting).
 */
package Exercises_Data_Types_and_Variables;

/**
 *
 * @author There Be Dragons
 */
public class P07_Strings_and_Objects {
    public static void main(String[] args) {
        String one = "Hello";
        String two = "World";
        
        Object concat = one + " " + two;
        String newString = (String)concat;
        System.out.println(newString);
    }
}
