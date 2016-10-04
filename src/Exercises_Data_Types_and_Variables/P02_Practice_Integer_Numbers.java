/**
 * Create a new Java project and create a program that assigns integer values to 
 * variables. Be sure that each value is stored in the correct variable type 
 * (try to find the most suitable variable type in order to save memory). 
 * Finally, you need to print all variables to the console.
 * 100
 * 128
 * -3540
 * 64876
 * 2147483648
 * -1141583228
 * -1223372036854775808
 */
package Exercises_Data_Types_and_Variables;


/**
 *
 * @author There Be Dragons
 */
public class P02_Practice_Integer_Numbers {
    public static void main(String[] args) {
        byte sNum1 = -100;
        short sNum2 = 128;
        short sNum3 = -3540;
        int iNum1 = 64876;
        long biNum1 = Long.parseLong("2147483648");
        int biNum2 = -1141583228;
        long bdNum = Long.parseLong("-1223372036854775808");
        
        System.out.println(sNum1);
        System.out.println(sNum2);
        System.out.println(sNum3);
        System.out.println(iNum1);
        System.out.println(biNum1);
        System.out.println(biNum2);
        System.out.println(bdNum);
    }
}
